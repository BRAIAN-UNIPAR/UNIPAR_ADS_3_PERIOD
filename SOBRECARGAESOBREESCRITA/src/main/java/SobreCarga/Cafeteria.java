package SobreCarga;

public class Cafeteria implements CafeteriaService {

    public void servirCafe() {
        System.out.println("Servindo café puro.");
    }

    public void servirCafe(String aditivo) {
        System.out.println("Servindo café com " + aditivo + ".");
    }

    public void servirCafe(String aditivo1, String aditivo2) {
        System.out.println("Servindo café com " + aditivo1 + " e " + aditivo2 + ".");
    }

    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();
        cafeteria.servirCafe();
        cafeteria.servirCafe("açúcar");
        cafeteria.servirCafe("açúcar", "leite");
    }

}