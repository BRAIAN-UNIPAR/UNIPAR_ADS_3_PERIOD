package SobreEscritaCarro;

public class Carro extends Veiculo {

    public Carro(Integer codigo, String marca, String modelo, TipoVeiculo tipoVeiculo) {
        super(marca, modelo, tipoVeiculo);
    }

    @Override
    void acelerar() {
        setVelocidade(getVelocidade() + 10);
    }

    @Override
    void frear() {
        setVelocidade(Math.max(0, getVelocidade() - 5));
    }

    @Override
    void virar() {
        System.out.println("Virando o volante do carro...");
    }

    public void atirarDoCarro() {
        System.out.println("Atirando do carro...");
    }
}
