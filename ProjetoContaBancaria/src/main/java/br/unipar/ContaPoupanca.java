package br.unipar;

public class ContaPoupanca extends HerencaContaBancaria{

    @Override
    public boolean saque(Double valor) {

        if (saldo >= valor){
            saldo -= valor;
            return true;
        }

        return false;
    }

}
