package org.ssatelier.JavaBasico.EjercicioTema3;

public class EstructurasControl {
    public static void main(String[] args) {

        String[] nombres = {"Olivia", "Marian", "Sebastian"};

        StringBuilder nombresConcatenados = new StringBuilder();
        for(String nombre : nombres){
            nombresConcatenados.append(nombre).append(" ");
        }

        System.out.println(nombresConcatenados);
    }
}
