package com.ciclo3.inicio;

public class inicio {

    public static void main(String[] args){
        //quiero crear una instancia de la clase zapato
        zapato  miZapato = new zapato();//reservamos un espacio en la memoria para el objeto de la clase
        miZapato.setTalla(34);
        miZapato.setColor("gris");
        miZapato.setMarca("Arturo calle");

        zapato  miZapato1 = new zapato();//reservamos un espacio en la memoria para el objeto de la clase
        miZapato1.setTalla(32);
        miZapato1.setColor("Azul");
        miZapato1.setMarca("NIKE");

        //System.out.println(miZapato1.getColor());

        Estudiante  nuevoEstudiante = new Estudiante("David","sandoval");

        //System.out.println(nuevoEstudiante.NombresCompletos());





    }
}
