import java.util.Scanner;

public class ExempleFor {

    public static void main(String[] args) {

      
//exemplo
//        i++ é igual a i = 1 + 1
//        for(variavel; condicao; incremento){
//        for (int i = 0; i <= 10;i++) {
//            System.out.println("i: "+ i);
//        }

      
//tabuada

        int num = 0;
        int ateQuanto = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numero da tabuada que deseja");
        num = scanner.nextInt();

        System.out.println("Até quando desja multiplicar");
        ateQuanto = scanner.nextInt();

        for (int i = 0; i <=ateQuanto ; i++) {
            System.out.print(num+ " x "+ i +" = "+ i*num);

            if ((i*num) % 2 == 0){
                System.out.println(" É par");
               }else{
                System.out.println(" É impar");
            }
        }
   }
}
