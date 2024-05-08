package br.unipar;

public interface InterfaceContaBancaria {
    Double obterSaldo();

    void depositar(Double valor);

    String retornarNumeroConta();

    boolean saque(Double valor);



}
