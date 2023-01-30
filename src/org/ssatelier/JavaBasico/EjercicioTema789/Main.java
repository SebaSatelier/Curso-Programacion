package org.ssatelier.JavaBasico.EjercicioTema789;

import java.io.*;
import java.util.*;

public class Main {
    // Funcion reverse, devuelve una cadena al reves.
    public static String reverse(String texto){
     StringBuilder sb = new StringBuilder(texto);
     String textoAlReves = sb.reverse().toString();
     return textoAlReves;
    }

    //Funcion divide por cero
    public static int dividePorCero(int numero) throws ArithmeticException{
        System.out.println("elije el numero para dividir por cero");
        return numero/0;

    }
    //Funcion copiar fichero
    public static void copiarFichero (String fileIn, String filOut) throws IOException {
        InputStream fichero = new FileInputStream(fileIn);
        byte[] datos = fichero.readAllBytes();
        PrintStream nuevoFichero = new PrintStream(filOut);
        nuevoFichero.write(datos);

    }

    public static void main(String[] args) {
        // tarea texto al reves.
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese cualquier texto: ");
        String texto = reverse(scan.nextLine());
        System.out.println("El texto al reves es: " + texto);
        System.out.println("------------------------------------------------");
        //Tarea array unidemensional

        String [] stringArray = {"Olivia", "Marian", "Sebastian"};
        for(String nombre : stringArray){
            System.out.println(nombre);
        }
        System.out.println("------------------------------------------------");

        // Tarea array bidemensional enteros.

        int [][] intArray = {{25,7,90},{26,8,17},{15,7,89}};
        for(int i = 0; i<intArray.length; i++){
            for(int j = 0 ; j<intArray[i].length; j++){
                System.out.println("Posicion "+i+" "+j+" = "+intArray[i][j]);
            }
        }

        System.out.println("------------------------------------------------");

        //Tarea crear vector y eliminar elementos
        Vector<String> nombres = new Vector<>();
        nombres.add("Marian");
        nombres.add("Olivia");
        nombres.add("Sebastian");
        nombres.add("Pupo");
        nombres.add("Felix");
        nombres.remove(1);
        nombres.remove(2);

        System.out.println(nombres);

        System.out.println("------------------------------------------------");

        //Tarea ArrayList String

        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Marian");
        listaNombres.add("Olivia");
        listaNombres.add("Sebastian");
        listaNombres.add("Pupo");

        List<String> nuevaLista = new LinkedList<>();
        nuevaLista.add(nuevaLista.toString());

        System.out.println("Imprimiendo ArrayList = " + listaNombres);
        System.out.println("Imprimiendo LinkedList = " + listaNombres);

        System.out.println("------------------------------------------------");

        //Tarea rellenar Arraylist de enteros.

        List<Integer> listaEnteros = new ArrayList<>();
        for (int i = 0 ; i<10 ; i++){
            listaEnteros.add(i+1);
        }
        for (int i = 0 ; i<listaEnteros.size() ; i++){
            if(listaEnteros.get(i)%2 == 0){
                listaEnteros.remove(i);
            }
        }
        System.out.println(listaEnteros);
        System.out.println("------------------------------------------------");

        //Tarea funcion dividePorCero

        try{
            dividePorCero(scan.nextInt());
        }catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally {
            System.out.println("Demo de Codigo");
        }
        System.out.println("------------------------------------------------");

    }
}

