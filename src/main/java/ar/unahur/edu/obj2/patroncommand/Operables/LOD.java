package ar.unahur.edu.obj2.patroncommand.Operables;

import ar.unahur.edu.obj2.patroncommand.Programabe.Programable;

public class LOD extends ComandoOperable {

    private Integer addr;

    public LOD(Integer addr) {
        this.addr = addr;
    }

    @Override
    public void doExecute(Programable micro) {
        micro.setAcumuladorA(micro.getAddr(addr));
    }
}
