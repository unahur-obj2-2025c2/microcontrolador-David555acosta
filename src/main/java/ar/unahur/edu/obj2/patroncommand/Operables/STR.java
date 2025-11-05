package ar.unahur.edu.obj2.patroncommand.Operables;

import ar.unahur.edu.obj2.patroncommand.Programabe.Programable;

public class STR extends ComandoOperable {
    private Integer addr;

    public STR(Integer addr) {
        this.addr = addr;
    }

    @Override
    public void doExecute(Programable micro) {
        micro.setAddr(addr);
    }

}
