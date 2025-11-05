package ar.unahur.edu.obj2.patroncommand.Programabe;

import java.util.Arrays;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.Excepciones.FueraDeRangoException;
import ar.unahur.edu.obj2.patroncommand.Operables.Operable;

public class MicroControlador implements Programable {
    Integer acuA = 0;
    Integer acuB = 0;
    Integer programCounter = 0;
    List<Integer> memoria = Arrays.asList(new Integer[1024]);

    @Override
    public void run(List<Operable> operaciones) {
        operaciones.forEach(o -> o.execute(this));
    }

    @Override
    public void incProgramCounter() {
        this.programCounter += 1;
    }

    @Override
    public Integer getProgramCounter() {
        return this.programCounter;
    }

    @Override
    public void setAcumuladorA(Integer value) {
        this.acuA = value;
    }

    @Override
    public Integer getAcumuladorA() {
        return this.acuA;
    }

    @Override
    public void setAcumuladorB(Integer value) {
        this.acuB = value;
    }

    @Override
    public Integer getAcumuladorB() {
        return this.acuB;
    }

    private void estaEnRangoValido(Integer direccionMemoria) {
        if (direccionMemoria < 0 || direccionMemoria > 1023) {
            throw new FueraDeRangoException("La direccion esta fuera de rango");
        }
    }

    @Override
    public void setAddr(Integer addr) {
        this.estaEnRangoValido(addr);
        memoria.set(addr, acuA);
    }

    @Override
    public Integer getAddr(Integer addr) {
        this.estaEnRangoValido(addr);
        return memoria.get(addr);
    }

    @Override
    public void reset() {
        Integer acuA = 0;
        Integer acuB = 0;
        Integer programCounter = 0;
        List<Integer> memoria = Arrays.asList(new Integer[1024]);
    }
}
