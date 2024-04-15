import java.util.Scanner;

class Circulo {
    private double raio;
    private String cor;

 
    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }


    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void exibirCaracteristicas() {
        System.out.println("Circulo:");
        System.out.println("Raio: " + raio);
        System.out.println("Cor: " + cor);
        System.out.println("area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.print("Insira o raio do circulo: ");
        double raio = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Insira a cor do circulo: ");
        String cor = scanner.nextLine();

     
        Circulo circulo = new Circulo(raio, cor);

        circulo.exibirCaracteristicas();

        scanner.close();
    }
}
