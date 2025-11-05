package ar.unahur.edu.obj2.patroncommand.Operables;

import ar.unahur.edu.obj2.patroncommand.Programabe.Programable;

public class SWAP extends ComandoOperable {

    @Override
    public void doExecute(Programable micro) {
        Integer valorA = micro.getAcumuladorA();
        micro.setAcumuladorA(micro.getAcumuladorB());
        micro.setAcumuladorB(valorA);
    }
}
