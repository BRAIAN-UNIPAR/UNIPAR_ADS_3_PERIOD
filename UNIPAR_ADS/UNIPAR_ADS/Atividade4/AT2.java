import java.util.Scanner;

public class AT2 {
    
    public static void main(String[] args) {
        
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um numero: ");
        num = scanner.nextInt();
        
        if(num % 2 == 0) {
        System.out.println("O numero "+ num + " e par ");
        }else{
             System.out.println("O numero "+ num + " e impar ");
        }
        
        scanner.close();
        
    }
    
}
