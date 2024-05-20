import java.util.Scanner;

class AT2 {
    public static void main(String[] args) {
        
        int primeiroValor = 0;
        int segundoValor = 0;
        int total = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        primeiroValor = scanner.nextInt();
        
        System.out.println("Informe o segundo valor: ");
        segundoValor = scanner.nextInt();
        
        scanner.close();
    
        total = primeiroValor - segundoValor;
        
        System.out.println("O valor da subtracao eh: " + total);
        
    }
}
