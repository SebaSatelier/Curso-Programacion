package org.ssatelier.introduccionProgramacion.Seccion9;

public class Seccion9 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setEdad(33);
        cliente1.setNombre("Marian");
        cliente1.setTelefono(12345678);
        cliente1.setCredito(353.10);

        System.out.println("Datos Cliente1:"+
                "\nNombre:"+cliente1.getNombre()+
                "\nEdad:"+cliente1.getEdad()+
                "\nTelefono:"+cliente1.getTelefono()+
                "\nCredito:"+cliente1.getCredito());


        Trabajador trabajador1 = new Trabajador();
        trabajador1.setEdad(32);
        trabajador1.setNombre("Sebastian");
        trabajador1.setTelefono(12345);
        trabajador1.setSalario(3500);

        System.out.println("\nDatos Trabajador1:"+
                "\nNombre:"+trabajador1.getNombre()+
                "\nEdad:"+trabajador1.getEdad()+
                "\nTelefono:"+trabajador1.getTelefono()+
                "\nCredito:"+trabajador1.getSalario());
    }
}
abstract class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

final class Cliente extends Persona{
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

final class Trabajador extends Persona{
    private double salario;

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }
}