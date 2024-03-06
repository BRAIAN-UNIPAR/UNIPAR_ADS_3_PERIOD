public class ControleEstoque {
    public static void main(String[] args) {
     
        String nomeProduto = "Fone de Ouvido";
        double precoProduto = 29.99;
        int quantidadeProduto = 10;
        String marcaProduto = "Apple";
        
        System.out.println("Dados do Produto:");
        System.out.println("Nome: " + nomeProduto);
        System.out.println("Marca: " + marcaProduto);
        System.out.printf("Preco: $%.2f%n", precoProduto); 
        System.out.println("Quantidade em estoque: " + quantidadeProduto);
    }
}
