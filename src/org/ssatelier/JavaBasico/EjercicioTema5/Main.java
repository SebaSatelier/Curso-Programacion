package org.ssatelier.JavaBasico.EjercicioTema5;

public class Main {
    static CocheCRUD coches = new CocheCRUDImpl();

    public static void main(String[] args) {
        Coche coche1 = new Coche("Fiat", "Punto", "Rojo");

        coches.save(coche1);

        coches.delete(coche1);

        coches.findAll();


    }
}
