package org.ssatelier.JavaBasico.EjercicioTema4;

public class SmartWatch extends SmartDevice{
    private String tipoMalla;

    public SmartWatch() {}

    public SmartWatch(String tipo, double precio, String marca, String modelo, String tamanoPantalla, String tipoMalla) {
        super(tipo, precio, marca, modelo, tamanoPantalla);
        this.tipoMalla = tipoMalla;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nTipo Malla= " + tipoMalla;
    }
}
