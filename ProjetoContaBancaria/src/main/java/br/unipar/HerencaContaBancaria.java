package br.unipar;

import java.util.UUID;

abstract class HerencaContaBancaria implements InterfaceContaBancaria{

     protected Double saldo;
     private String numeroConta;

    public HerencaContaBancaria() {
        saldo = 0.0;
        numeroConta = UUID.randomUUID().toString();
    }

    @Override
    public Double obterSaldo() {
        return saldo;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public String retornarNumeroConta() {
        return numeroConta;
    }

}
