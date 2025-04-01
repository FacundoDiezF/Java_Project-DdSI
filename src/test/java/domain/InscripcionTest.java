package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class InscripcionTest {

        Alumno alumnoTest = new Alumno("Juan", "Perez");
        Inscripcion inscripcion = new Inscripcion(alumnoTest);

        Materia materia1 = new Materia("AM-I");
        Materia materia2 = new Materia("AM-II", materia1);
        Materia materia3 = new Materia("Ingles");


    @Test
    @DisplayName("Test inscripcion valida, cumple correlativas")
    void aprobadaValida() {

        inscripcion.agregarMateriasACursar(materia2, materia3);
        alumnoTest.agregarMateriasAprobadas(materia1);

        assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test inscripcion invalida, NO cumple correlativas")
    void aprobadaInvalida() {

        inscripcion.agregarMateriasACursar(materia2, materia3);
        assertFalse(inscripcion.aprobada());
    }



}