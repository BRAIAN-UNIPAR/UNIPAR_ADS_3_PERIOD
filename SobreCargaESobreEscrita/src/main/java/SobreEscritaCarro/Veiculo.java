package SobreEscritaCarro;

public abstract class Veiculo {

    private Integer codigo;
    private String marca;
    private String modelo;
    private TipoVeiculo tipo;
    private int velocidade;

    public Veiculo(String marca, String modelo, TipoVeiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.velocidade = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    abstract void acelerar();

    abstract void frear();

    abstract void virar();

    void dirigir() {
        System.out.println("Dirigindo um(a) " + tipo + " " + marca + " " + modelo);
    }

}
