import java.util.Scanner;

class AT1 {
    public static void main(String[] args) {
        
        int primeiroValor = 0;
        int segundoValor = 0;
        int terceiroValor = 0;
        int total = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        primeiroValor = scanner.nextInt();
        
        System.out.println("Informe o segundo valor: ");
        segundoValor = scanner.nextInt();
        
        System.out.println("Informe o terceiro valor: ");
        terceiroValor = scanner.nextInt();
        
        scanner.close();
    
        total = primeiroValor + segundoValor + terceiroValor;

        System.out.println("O valor da soma eh: " + total);
        
    }
}
