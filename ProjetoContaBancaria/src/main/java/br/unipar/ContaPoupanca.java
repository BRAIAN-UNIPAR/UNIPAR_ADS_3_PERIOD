package br.unipar;

public class ContaPoupanca extends HerencaContaBancaria{

    private static final double TAXA_SAQUE = 5.0;

    @Override
    public boolean saque(Double valor) {

        if (saldo >= valor){
            saldo -= valor;
            saldo -= TAXA_SAQUE;
            return true;
        }

        return false;
    }

}
