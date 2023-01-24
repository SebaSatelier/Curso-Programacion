package org.ssatelier.JavaBasico.EjercicioTema4;

public abstract class SmartDevice {
    private String tipo;
     private double precio;
    private String marca;
    private String modelo;

    private String tamanoPantalla;

    public SmartDevice(){}

    public SmartDevice(String tipo, double precio, String marca, String modelo, String tamanoPantalla) {
        this.tipo = tipo;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.tamanoPantalla = tamanoPantalla;
    }

    @Override
    public String toString() {
        return "Tipo= " + tipo +
                "\nPrecio= " + precio +
                "\nMarca= " + marca +
                "\nModelo= " + modelo +
                "\nTamaño Pantalla= " + tamanoPantalla;
    }
}
