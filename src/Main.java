public class Main {
    public static void main(String[] args) {
        int resultado = suma(10, 20, 30);

        System.out.println(resultado);

        Coche miCoche = new Coche();

        miCoche.sumarPuerta(4);
        System.out.println(miCoche.numeroPuertas);

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
