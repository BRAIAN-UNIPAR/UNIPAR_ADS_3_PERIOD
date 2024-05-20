import java.util.Scanner;

public class ContagemNumeros {
    private static int countMenorQue100 = 0;
    private static int countEntre101e200 = 0;
    private static int countMaiorQue200 = 0;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 20 numeros:");

        for (int i = 0; i < 4; i++) {
            int numero = scanner.nextInt();
            verificarNumero(numero);
        }

        System.out.println("Quantidade de numeros entre 0 e 100: " + countMenorQue100);
        System.out.println("Quantidade de numeros entre 101 e 200: " + countEntre101e200);
        System.out.println("Quantidade de numeros maiores que 200: " + countMaiorQue200);

        scanner.close();
    }

    public static void verificarNumero(int numero) {
        if (numero >= 0 && numero <= 100) {
            countMenorQue100++;
        } else if (numero <= 200) {
            countEntre101e200++;
        } else {
            countMaiorQue200++;
        }
    }
}
