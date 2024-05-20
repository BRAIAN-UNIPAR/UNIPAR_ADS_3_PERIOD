import java.util.Scanner;

class AT3 {
    public static void main(String[] args) {
        
        double primeiraNota = 0.0;
        double segundaNota = 0.0;
        double media = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota: ");
        primeiraNota = scanner.nextInt();
        
        System.out.println("Informe a segunda nota: ");
        segundaNota = scanner.nextInt();
        
        scanner.close();
    
        media = (primeiraNota + segundaNota) / 2;
        
        System.out.println("O valor da divisao eh: " + media);
        
    }
}
