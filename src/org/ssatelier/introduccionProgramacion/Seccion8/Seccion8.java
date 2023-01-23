package org.ssatelier.introduccionProgramacion.Seccion8;

public class Seccion8 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        persona1.setEdad(33);
        persona1.setNombre("Marian");
        persona1.setTelefono(123456789);

        Persona persona2 = new Persona();

        persona2.setEdad(5);
        persona2.setNombre("Olivia");
        persona2.setTelefono(12341234);

        System.out.println("El nombre de la persona 1 es "+persona1.getNombre()+
                ", tiene "+persona1.getEdad()+" años y su teléfono es "+persona1.getTelefono());

        System.out.println("\nEl nombre de la persona 2 es "+persona2.getNombre()+
                ", tiene "+persona2.getEdad()+" años y su teléfono es "+persona2.getTelefono());

    }
}
    class Persona{
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
