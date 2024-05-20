
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    
    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double calcularPrecoComDesconto(double descontoPercentual) {
        double desconto = preco * (descontoPercentual / 100);
        return preco - desconto;
    }
    
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço: R$ " + preco);
    }
}

public class CarroTeste {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("volkswagen", "Polo", 2010, 32000.00);
        
        System.out.println("Informações do Carro:");
        meuCarro.exibirInfo();
        
        meuCarro.setPreco(40000.00);
        
        System.out.println("Informações do Carro (após alteração do preço):");
        meuCarro.exibirInfo();
        
        double precoComDesconto = meuCarro.calcularPrecoComDesconto(10);
        System.out.println("Preço com 10% de desconto: R$ " + precoComDesconto);
    }
}
