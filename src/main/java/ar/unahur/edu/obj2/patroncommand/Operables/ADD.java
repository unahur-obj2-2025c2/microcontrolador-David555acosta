package ar.unahur.edu.obj2.patroncommand.Operables;

import ar.unahur.edu.obj2.patroncommand.Programabe.Programable;

public class ADD extends ComandoOperable {

    @Override
    public void doExecute(Programable microControlador) {
        Integer resultado = microControlador.getAcumuladorA() + microControlador.getAcumuladorB();
        microControlador.setAcumuladorA(resultado);
        microControlador.setAcumuladorB(0);
    }

}
