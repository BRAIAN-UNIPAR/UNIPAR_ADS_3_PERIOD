import br.unipar.ContaPoupanca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaPoupancaTest {

    @Test
    public void testDepositoContaPoupanca(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(5000d);

        assertEquals(conta.obterSaldo(), 5000);
    }

    @Test
    public void testSaqueContaPoupanca(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(3000d);
        boolean validacao = conta.saque(3000d);

        assertTrue(validacao);

        assertEquals(3000, conta.obterSaldo());
    }


    @Test
    public void testSaqueMaiorSaldoContaPoupanca(){
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(3000d);
        boolean validacao = conta.saque(4500d);

        assertFalse(validacao);

        assertEquals(1500, conta.obterSaldo());
    }
    
}
