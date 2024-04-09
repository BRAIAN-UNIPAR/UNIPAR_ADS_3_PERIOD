//aqui crio a classe produto 

public class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int codigo, String descricao, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
        System.out.println("Estoque atualizado: " + quantidadeEmEstoque);
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Estoque atualizado: " + quantidadeEmEstoque);
        } else {
            System.out.println("Estoque insuficiente para remover a quantidade especificada.");
        }
    }
}


// aqui a testa chamando os metodos 
//testar mensagem de erro de saldo

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto(1001, "Camiseta", 29.99, 50);
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());

        produto.adicionarEstoque(20);
        produto.removerEstoque(10);
        produto.removerEstoque(100); /
    }
}
