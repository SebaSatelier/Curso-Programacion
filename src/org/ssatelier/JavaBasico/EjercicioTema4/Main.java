package org.ssatelier.JavaBasico.EjercicioTema4;

public class Main {
    public static void main(String[] args) {


        SmartDevice watch = new SmartWatch("reloj", 859.34, "Samsung", "SM7",
                "1,75\"", "Plastico");

        SmartDevice phone = new SmartPhone("Celular", 1532.87, "Motorola", "E7 Plus",
                "7,89\"", "11,0 MP");

        System.out.println(watch.toString());
        System.out.println();
        System.out.println(phone.toString());

    }
}
