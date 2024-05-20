import java.util.Scanner;

public class IdadeEmDias {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();
        
        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();
        
        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();
        
        scanner.close();
        
        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);
        
        System.out.println("A idade expressa em dias e: " + idadeEmDias + " dias.");
    }
    
    public static int calcularIdadeEmDias(int anos, int meses, int dias) {
        int idadeEmDias = 0;
        
        idadeEmDias += anos * 365;
        idadeEmDias += meses * 30;
        idadeEmDias += dias;
        
        return idadeEmDias;
    }
}
