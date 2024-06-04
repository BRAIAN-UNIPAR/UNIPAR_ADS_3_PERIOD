package br.unipar;

import java.sql.*;

public class MainProduto {

    private static final String url = "jdbc:postgresql://localhost:5432/Exemplo1";
    private static final String user = "postgres";
    private static final String password = "admin123";

    public static void main(String[] args) {

        inserirProduto("PC gamer", 3000.00);
        listarTodosProdutos();

    }

    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void inserirProduto(String descricao, double valor) {
        try {
            Connection conn = connection();
            PreparedStatement preparedStatement = conn.prepareStatement(
                    "INSERT INTO produto (descricao, valor) "
                            + "VALUES (?,?)"
            );
            preparedStatement.setString(1, descricao);
            preparedStatement.setDouble(2, valor);
            preparedStatement.executeUpdate();
            System.out.println("PRODUTO INSERIDO COM SUCESSO!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static int listarTodosProdutos() {
        int i = 0;
        try {
            Connection conn = connection();
            Statement statement = conn.createStatement();
            System.out.println("Listando produtos");
            ResultSet result = statement.executeQuery("SELECT * FROM produto");
            while (result.next()) {
                System.out.println(result.getInt("id_produto"));
                System.out.println(result.getString("descricao"));
                System.out.println(result.getDouble("valor"));
                i++;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return i;
    }
}