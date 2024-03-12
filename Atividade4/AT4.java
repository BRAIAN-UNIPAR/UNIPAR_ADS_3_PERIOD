import java.util.Scanner;

public class AT4 {
    
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        num1 = scanner.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        num2 = scanner.nextInt();
        
        if(num1 > num2) {
        System.out.println("O primeiro numero " + num1 +" e maior ");
        }else{
               System.out.println("O segundo numero " + num2 +" e maior ");
        }
        
        scanner.close();
        
    }
    
}
