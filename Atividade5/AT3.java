package br.unipar.main;

import java.util.Scanner;

public class ExempleDoWhile {


    public static void main(String[] args) {
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Para continuar informe 0");
            opcao = scanner.nextInt();

        } while (opcao == 0);
        System.out.println("Voce saiu");

    }
}

