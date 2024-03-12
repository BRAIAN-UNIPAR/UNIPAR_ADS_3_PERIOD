import java.util.Scanner;

public class AT3 {
    
    public static void main(String[] args) {
        
        String user;
        String password;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("User: ");
        user = scanner.nextLine();
        
         System.out.println("Password: ");
        password = scanner.nextLine();
        
        if(user.equals("user") && password.equals("password123")) {
        System.out.println("Loguin bem sucedido");
        }else{
             System.out.println("Usuario negado");
        }
        
        scanner.close();
        
    }
    
}
