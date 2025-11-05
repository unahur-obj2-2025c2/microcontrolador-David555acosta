package ar.unahur.edu.obj2.patroncommand.Operables;

import ar.unahur.edu.obj2.patroncommand.Programabe.Programable;

public class LODV extends ComandoOperable {
    private Integer value;

    public LODV(Integer value) {
        this.value = value;
    }

    @Override
    public void doExecute(Programable micro) {
        micro.setAcumuladorA(value);
    }

    

}
