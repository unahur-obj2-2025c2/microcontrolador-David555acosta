package ar.unahur.edu.obj2.patroncommand;

import java.util.Arrays;
import java.util.List;

public class MicroControlador implements Programable {
    Integer acuA;
    Integer acuB;
    Integer programCounter;
    List<Integer> memoria = Arrays.asList(new Integer[1024]);

    @Override
    public void run(List<Operable> operaciones) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public void incProgramCounter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'incProgramCounter'");
    }

    @Override
    public Integer getProgramCounter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProgramCounter'");
    }

    @Override
    public void setAcumuladorA(Integer value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAcumuladorA'");
    }

    @Override
    public Integer getAcumuladorA() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAcumuladorA'");
    }

    @Override
    public void setAcumuladorB(Integer value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAcumuladorB'");
    }

    @Override
    public Integer getAcumuladorB() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAcumuladorB'");
    }

    @Override
    public void setAddr(Integer addr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAddr'");
    }

    @Override
    public Integer getAddr(Integer addr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAddr'");
    }

    @Override
    public void reset() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reset'");
    }
}
