package domain;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class Materia {
    private String nombre;
    private List<Materia> correlativas;

    //------------- Constructor
    public Materia(String nombre, Materia ... correlativas) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
        Collections.addAll(this.correlativas, correlativas);
    }

}
