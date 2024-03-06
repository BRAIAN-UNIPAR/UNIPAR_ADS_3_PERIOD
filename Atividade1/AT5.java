public class ControleEstoque {
    public static void main(String[] args) {

        String nomeSmartphone = "Iphone Xr";
        String marcaSmartphone = "Apple";
        double precoSmartphone = 2999.99;
        int quantidadeSmartphone = 50;

        String nomeLaptop = "Inspiron 15";
        String marcaLaptop = "Dell";
        double precoLaptop = 4499.99;
        int quantidadeLaptop = 30;

        String nomeFoneBluetooth = "AirPods Pro";
        String marcaFoneBluetooth = "Apple";
        double precoFoneBluetooth = 1499.99;
        int quantidadeFoneBluetooth = 100;

        System.out.println("Dados do Smartphone:");
        System.out.println("Nome: " + nomeSmartphone);
        System.out.println("Marca: " + marcaSmartphone);
        System.out.println("Preco: R$" + precoSmartphone);
        System.out.println("Quantidade em estoque: " + quantidadeSmartphone);

        System.out.println("\nDados do Laptop:");
        System.out.println("Nome: " + nomeLaptop);
        System.out.println("Marca: " + marcaLaptop);
        System.out.println("Preco: R$" + precoLaptop);
        System.out.println("Quantidade em estoque: " + quantidadeLaptop);

        System.out.println("\nDados do Fone de Ouvido Bluetooth:");
        System.out.println("Nome: " + nomeFoneBluetooth);
        System.out.println("Marca: " + marcaFoneBluetooth);
        System.out.println("Preco: R$" + precoFoneBluetooth);
        System.out.println("Quantidade em estoque: " + quantidadeFoneBluetooth);
    }
}
