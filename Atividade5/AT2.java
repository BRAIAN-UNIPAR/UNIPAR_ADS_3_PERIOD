import java.util.Scanner;

public class MusicaDosPatinhos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o numero inicial de patinhos: ");
        int n = scanner.nextInt();
        
        while (n > 0) {
            System.out.println(n + " patinhos foram passear");
            System.out.println("Alem das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamae gritou: Qua, qua, qua, qua");
            n--;
            if (n > 0) {
                System.out.println("Mas so " + n + " patinhos voltaram de la");
            } else {
               System.out.println("A mamae patinha foi procurar");
               System.out.println("Alem das montanhas");
               System.out.println("Na beira do mar");
               System.out.println("A mamae gritou: Qua, qua, qua, qua");
               System.out.println("E os patinhos voltaram de la.");
            }
        }
        scanner.close();
    }
}
