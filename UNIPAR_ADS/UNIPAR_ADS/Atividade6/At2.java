public class Produto {
  
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

   public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

  
// CLASSE TESTE 

public class TesteProduto {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Camiseta", 29.99, 50);
        Produto produto2 = new Produto("Calça Jeans", 79.99, 30);

    
        System.out.println("Informações do Produto 1:");
        produto1.exibirInformacoes();

        System.out.println("\nInformações do Produto 2:");
        produto2.exibirInformacoes();

        produto1.setPreco(39.99);
        produto1.setQuantidadeEmEstoque(40);

        System.out.println("Informações do Produto 1 (após modificação):");
        produto1.exibirInformacoes();
    }
  }
}
