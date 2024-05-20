import java.util.Scanner;

class AT4 {
    public static void main(String[] args) {
        
        double primeiraNota = 0.0;
        double segundaNota = 0.0;
        double terceiraNota = 0.0;
        double quartaNota = 0.0;
        double media = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota: ");
        primeiraNota = scanner.nextInt();
        
        System.out.println("Informe a segunda nota: ");
        segundaNota = scanner.nextInt();
        
        System.out.println("Informe a terceira nota: ");
        terceiraNota = scanner.nextInt();
        
        System.out.println("Informe a quarta nota: ");
        quartaNota = scanner.nextInt();
    
        media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
        
        if(media >= 6){
              System.out.println("Voce esta aprovado, sua media foi: " + media);
        }else{
            System.out.println("Voce esta reprovado, sua media foi: " + media);
        }
        
    }
}
