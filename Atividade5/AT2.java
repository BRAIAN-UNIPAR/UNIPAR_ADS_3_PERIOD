package br.unipar.main;

import java.util.Scanner;

public class ExempleWhile {

    public static void main(String[] args) {

        int contador = 0;
        int opcao = 1;
        Scanner scanner = new Scanner(System.in);


//        while (contador <= 10) {
//            System.out.println("contador " + contador);
//            contador = contador + 1;
//
//        }


//        while (true) {
//            System.out.println("Informe um valor");
//            opcao = scanner.nextInt();
//
//            if (opcao == 0) {
//                break;
//            }
//        }


        while (opcao != 0){
            System.out.println("Informe um valor ");
            opcao = scanner.nextInt();
        }
    }
}
