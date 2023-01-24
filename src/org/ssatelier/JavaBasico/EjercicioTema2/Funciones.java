package org.ssatelier.JavaBasico.EjercicioTema2;

public class Funciones {
    public static void main(String[] args) {
        double precioHeladera = 1300;

        double precioNotebook = 1550.87;

        System.out.println("Precio final Heladera = " + sumarIva(precioHeladera));

        System.out.println("Precio final Notebook = " + sumarIva(precioNotebook));


    }
    public static double sumarIva(double precio){
        return precio * 1.21; // El IVA en Argentina es 21%
    }
}
