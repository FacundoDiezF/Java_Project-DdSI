package domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class Alumno {
    private String nombre;
    private String apellido;
    List<Materia> materiasAprobadas;

    //------------- Constructor
    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materiasAprobadas = new ArrayList<>();
    }

    //------------- Methods
    public void agregarMateriasAprobadas(Materia ... materias){
        Collections.addAll(materiasAprobadas, materias);
    }

    public boolean puedeCursar(Materia materia){
        return materiasAprobadas.containsAll(materia.getCorrelativas());
    }

}
