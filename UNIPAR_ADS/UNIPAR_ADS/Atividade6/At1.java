public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

   
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public static void main(String[] args) {
  
        Carro carro1 = new Carro("Toyota", "Corolla", 2022, "Prata");
        Carro carro2 = new Carro("Ford", "Focus", 2019, "Azul");

        System.out.println("Carro 1:");
        carro1.exibirInformacoes();
        System.out.println();

        System.out.println("Carro 2:");
        carro2.exibirInformacoes();
        System.out.println();

        carro1.setCor("Preto");
        carro1.setAno(2023);

        System.out.println("Carro 1 após modificação:");
        carro1.exibirInformacoes();
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
