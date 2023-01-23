package org.ssatelier.JavaBasico.EjercicioTema1;

public class TiposDatos {
    public static void main(String[] args) {
        //tipos numericos enteros
        byte var1 = 1;
        short var2 = 127;
        int var3 = 1235890;
        long var4 = 1234567890123L;

        System.out.println("byte = " + var1);
        System.out.println("short = " + var2);
        System.out.println("int = " + var3);
        System.out.println("long = " + var4);

        //tipos de datos numericos decimal.

        float var5= 23.67f;
        double var6 = 58.123456;

        System.out.println("float = " + var5);
        System.out.println("double = " + var6);

        //tipos de datos boleanos (verdadero-falso)

        boolean var7 = true;
        boolean var8 = false;

        System.out.println("true = " + var7);
        System.out.println("false = " + var8);

        //tipo de datos de caracteres y cadena de caracteres.

        char var9 = 'A';
        String var10 = "Sebastian Satelier";

        System.out.println("char = " + var9);
        System.out.println("String = " + var10);

    }
}
