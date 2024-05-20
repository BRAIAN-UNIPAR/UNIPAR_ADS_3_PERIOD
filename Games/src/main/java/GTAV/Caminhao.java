package GTAV;

public class Caminhao extends Veiculo {
    
    public Caminhao(Integer codigo, String marca, String modelo, TipoVeiculo tipoVeiculo) {
        super(marca, modelo, tipoVeiculo);
    }
     
    void acelerar() {
        setVelocidade(getVelocidade() + 5);
    }
     
    void frear() {
        setVelocidade(Math.max(0, getVelocidade() - 3));
    }
     
    void virar() {
        System.out.println("Virando o volante do caminhão...");
    }

    void carregarCarga() {
        System.out.println("Carregando carga no caminhão...");
    }
}


