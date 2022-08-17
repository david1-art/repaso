package com.ciclo3.inicio;

public class Estudiante extends Persona {
    public Estudiante(String nombre,String apellido) {
        setNombre(nombre);
        setApellido(apellido);
    }



    public String NombresCompletos(){
        return getNombre()+" "+getApellido();
    }
}
