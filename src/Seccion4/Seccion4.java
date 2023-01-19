package Seccion4;

public class Seccion4 {
    public static void main(String[] args) {
        int variableIf = -1;

        if (variableIf > 0 ){
            System.out.println("variableIf es positivo");
        } else if (variableIf < 0){
            System.out.println("variableIf es negativo");
        }else {
            System.out.println("variableIf es 0");
        }

        System.out.println("------------------------------------------");

        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile++;
            System.out.println("numeroWhile: "+numeroWhile);
        }

        System.out.println("------------------------------------------");

        do {
            numeroWhile++;
            System.out.println("numeroWhile del doWhile: "+numeroWhile);
        }while(numeroWhile<3);

        System.out.println("------------------------------------------");

        int numeroFor = 0;
        for (; numeroFor <=3 ; numeroFor++){
            System.out.println("numeroFor: "+numeroFor);
        }

        System.out.println("------------------------------------------");

        String estacion = "Hola";

        switch(estacion){
            case "Invierno":
                System.out.println("La estacion es invierno, vamos abrigarnos!!");
                break;
            case "Primavera":
                System.out.println("La estacion es primavera, muchas flores!");
                break;
            case "Verano":
                System.out.println("La estacion es verano, vayamos a la playa!");
                break;
            case "Otoño":
                System.out.println("La estacion es otoño, se caen las hojas de los arboles...");
                break;
            default:
                System.out.println("No se ha seleccionado ninguna estacion");
        }
    }
}
