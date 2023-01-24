package org.ssatelier.JavaBasico.EjercicioTema5;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save(Coche coche) {
        System.out.println("Metodo Save CRUD");
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("Metodo Delete CRUD");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo FindAll CRUD");
    }
}
