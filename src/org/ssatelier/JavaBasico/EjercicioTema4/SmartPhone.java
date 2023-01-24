package org.ssatelier.JavaBasico.EjercicioTema4;

public class SmartPhone extends SmartDevice {
    private String camara;

    public SmartPhone() {}

    public SmartPhone(String tipo, double precio, String marca, String modelo, String tamanoPantalla, String camara) {
        super(tipo, precio, marca, modelo, tamanoPantalla);
        this.camara = camara;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nCamara= " + camara;
    }
}
