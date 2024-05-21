package SobreEscritaCafeteria;

import SobreCargaCafeteria.Cafeteria;

public class ServicosCafeteria extends Cafeteria {

    public void exibirCardapio() {
        System.out.println("----- Cardápio -----");
        System.out.println("1. Café Puro");
        System.out.println("2. Café com Açúcar");
        System.out.println("3. Café com Açúcar e Leite");
        System.out.println("4. Suco Natural");
        System.out.println("5. Suco Artificial");
        System.out.println("6. Biscoitos");
        System.out.println("---------------------");
    }

    public void servirSuco(String sabor, boolean natural) {
        if (natural) {
            System.out.println("Servindo suco de " + sabor + " natural.");
        } else {
            System.out.println("Servindo suco de " + sabor + " artificial.");
        }
    }

    public void receberPedido(Integer mesa) {
        System.out.println("Atendendo encomenda da mesa " + mesa + ".");
    }

    public void limparBalcao() {
        System.out.println("Limpando o balcão da cafeteria.");
    }


    public static void main(String[] args) {
        ServicosCafeteria servicos = new ServicosCafeteria();
        servicos.exibirCardapio();

        servicos.servirSuco("laranja", true);
        servicos.servirSuco("uva", false);

        servicos.limparBalcao();

        servicos.receberPedido( 20);
    }
}
