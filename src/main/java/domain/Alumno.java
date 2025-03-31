package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    @Setter  @Getter private String nombre;
    @Setter  @Getter private String apellido;
    @Getter List<Materia> materiasAprobadas;

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

}
