package domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class Inscripcion {
    private List<Materia> materiasACursar;
    private Alumno alumno;
    boolean fueAprobada;

    //------------- Constructor
    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasACursar = new ArrayList<>();
    }

    //------------- Methods
    public void agregarMateriasACursar(Materia ... materias){
        Collections.addAll(this.materiasACursar, materias);
    }

    public boolean aprobada(){
        this.fueAprobada = this.materiasACursar.stream().allMatch(materia -> alumno.puedeCursar(materia));
        return this.fueAprobada;
    }
}
