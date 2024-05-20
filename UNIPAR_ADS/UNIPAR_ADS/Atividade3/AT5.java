import java.util.Scanner;

class AT5 {
    public static void main(String[] args) {
        
        int primeioValor = 0;
        int segundoValor = 0;
        int totalSoma = 0;
        int totalSubtracao = 0;
        int totalDivisao = 0; 
        int totalMultiplicacao = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        primeioValor = scanner.nextInt();
        
        System.out.println("Informe o segundo valor: ");
        segundoValor = scanner.nextInt();
        
        scanner.close();
    
        totalSoma = (primeioValor + segundoValor);
        totalSubtracao = (primeioValor - segundoValor);
        totalDivisao = (primeioValor / segundoValor);
        totalMultiplicacao = (primeioValor * segundoValor);
        
        System.out.println("O valor da soma eh: " + totalSoma);
        System.out.println("O valor da subtracao eh: " + totalSubtracao);
        System.out.println("O valor da multiplicacao eh: " + totalMultiplicacao);
        System.out.println("O valor da divisao eh: " + totalDivisao);
        
    }
}
