import java.util.Scanner;

public class AT1 {
    
    public static void main(String[] args) {
        
        int idade = 0;
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a sua idade: ");
        idade = scanner.nextInt();
        
        if(idade >= 18) {
        System.out.println("Voce e maior de idade");
        }else{
         System.out.println("Voce e menor de idade");
        }
        
        scanner.close();
        
    }
    
}
