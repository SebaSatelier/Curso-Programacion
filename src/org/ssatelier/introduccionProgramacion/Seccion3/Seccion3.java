package org.ssatelier.introduccionProgramacion.Seccion3;

public class Seccion3 {
    public static void main(String[] args) {
        int resultado = suma(10, 20, 30);

        System.out.println(resultado);

        Coche miCoche = new Coche();

        miCoche.sumarPuerta(4);
        System.out.println("el numero de puertas que tiene miCoche es: " + miCoche.numeroPuertas);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}


    class Coche{
        int numeroPuertas = 0;

        public void sumarPuerta(int a){
            numeroPuertas += a;
        }
    }
