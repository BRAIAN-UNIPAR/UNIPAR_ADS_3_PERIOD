package br.unipar;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(1000.0);

        System.out.println("Saldo é:"+
                contaCorrente.obterSaldo());


        System.out.println("Numero da conta é: "+
                contaCorrente.retornarNumeroConta());

    }
}
