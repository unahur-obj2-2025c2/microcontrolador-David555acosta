package ar.unahur.edu.obj2.patroncommand.Invoker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.unahur.edu.obj2.patroncommand.Programabe.MicroControlador;
import ar.unahur.edu.obj2.patroncommand.Programabe.Programable;

public class ProgramaTest {
    private Programa programa;
    private Programable micro;

    @BeforeEach()
    void setUP() {
        programa = new Programa();
        micro = new MicroControlador();
    }

    @Test
    void hacerAvanzar3PosicionesElProgramCounter() {
        programa.agregarOperacionNOP();
        programa.agregarOperacionNOP();
        programa.agregarOperacionNOP();
        programa.run(micro);
        assertEquals(3, micro.getProgramCounter());
    }

    @Test
    void sumar20Mas17() {
        programa.agregarLODV(20);
        programa.agregarSWAP();
        programa.agregarLODV(17);
        programa.agregarComandoADD();
        programa.run(micro);

        assertEquals(37, micro.getAcumuladorA());
        assertEquals(0, micro.getAcumuladorB());
        assertEquals(4, micro.getProgramCounter());
    }

    @Test
    void sumarDosMasOchoMasCinco() {
        programa.agregarLODV(2);
        programa.agregarSTR(0);
        programa.agregarLODV(8);
        programa.agregarSWAP();
        programa.agregarLODV(5);
        programa.agregarComandoADD();
        programa.agregarSWAP();
        programa.agregarLOD(0);
        programa.agregarComandoADD();
        programa.run(micro);

        assertEquals(15, micro.getAcumuladorA());
        assertEquals(0, micro.getAcumuladorB());
    }
}
