//aqui crio a classe ContaBancaria

public class ContaBancaria {
    private double saldo;
    private String numeroConta;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}

//aqui crio o Teste chamando os metodos e testo
//testar mensagem de erro 

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("1234");
        conta.depositar(1000.0);
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());

        conta.sacar(500.0);
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());

        conta.sacar(700.0); 
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
    }
}

