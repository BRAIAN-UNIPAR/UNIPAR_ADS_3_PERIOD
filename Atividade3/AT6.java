import java.util.Scanner;

class AT6 {
    static String nome;
    static double preco;
    static int percentualDesconto;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome do produto: ");
        nome = scanner.nextLine();
        
        System.out.println("Informe o preco: ");
        preco = scanner.nextDouble();
        
        System.out.println("Informe o percentual de desconto: ");
        percentualDesconto = scanner.nextInt();
        
        scanner.close();
        
        aplicarDesconto();
        
        System.out.println("O nome do produto eh: " + nome + " e seu preco com desconto eh: " + preco);
    }
    
    public static void aplicarDesconto() {
      double desconto = percentualDesconto / 100.0;
      preco = preco - (preco * desconto);
    }
    
}
