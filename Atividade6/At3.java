import java.util.Scanner;

class Produto {
  
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;


    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
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

  
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}

public class GerenciadorEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] estoque = new Produto[100]; 

        int opcao;
        int indice = 0;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar novo produto");
            System.out.println("2. Atualizar preço ou quantidade em estoque de um produto");
            System.out.println("3. Exibir detalhes de um produto");
            System.out.println("4. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o preço do produto:");
                    double preco = scanner.nextDouble();
                    System.out.println("Digite a quantidade em estoque do produto:");
                    int quantidade = scanner.nextInt();

                    estoque[indice] = new Produto(nome, preco, quantidade);
                    indice++;
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    if (indice == 0) {
                        System.out.println("Não há produtos no estoque.");
                        break;
                    }

                    System.out.println("Digite o nome do produto que deseja atualizar:");
                    String nomeProduto = scanner.nextLine();

               
                    Produto produtoAtualizar = null;
                    for (int i = 0; i < indice; i++) {
                        if (estoque[i].getNome().equalsIgnoreCase(nomeProduto)) {
                            produtoAtualizar = estoque[i];
                            break;
                        }
                    }

                    if (produtoAtualizar == null) {
                        System.out.println("Produto não encontrado.");
                        break;
                    }

                    System.out.println("Selecione o que deseja atualizar:");
                    System.out.println("1. Preço");
                    System.out.println("2. Quantidade em estoque");
                    int escolha = scanner.nextInt();
                    scanner.nextLine(); 

                    switch (escolha) {
                        case 1:
                            System.out.println("Digite o novo preço:");
                            double novoPreco = scanner.nextDouble();
                            produtoAtualizar.setPreco(novoPreco);
                            System.out.println("Preço atualizado com sucesso!");
                            break;
                        case 2:
                            System.out.println("Digite a nova quantidade em estoque:");
                            int novaQuantidade = scanner.nextInt();
                            produtoAtualizar.setQuantidadeEmEstoque(novaQuantidade);
                            System.out.println("Quantidade em estoque atualizada com sucesso!");
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;
                case 3:
                    if (indice == 0) {
                        System.out.println("Não há produtos no estoque.");
                        break;
                    }

                    System.out.println("Digite o nome do produto que deseja visualizar:");
                    String nomeProdutoExibir = scanner.nextLine();

                   
                    Produto produtoExibir = null;
                    for (int i = 0; i < indice; i++) {
                        if (estoque[i].getNome().equalsIgnoreCase(nomeProdutoExibir)) {
                            produtoExibir = estoque[i];
                            break;
                        }
                    }

                    if (produtoExibir == null) {
                        System.out.println("Produto não encontrado.");
                        break;
                    }

                    System.out.println("Detalhes do produto:");
                    System.out.println("Nome: " + produtoExibir.getNome());
                    System.out.println("Preço: " + produtoExibir.getPreco());
                    System.out.println("Quantidade em estoque: " + produtoExibir.getQuantidadeEmEstoque());
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }
}
