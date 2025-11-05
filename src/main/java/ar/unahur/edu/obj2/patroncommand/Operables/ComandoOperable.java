package ar.unahur.edu.obj2.patroncommand.Operables;

import ar.unahur.edu.obj2.patroncommand.Programabe.Programable;

public abstract class ComandoOperable implements Operable {

    @Override
    public void execute(Programable micro) {
        doExecute(micro);
        micro.incProgramCounter();

    }

    public abstract void doExecute(Programable micro);

}
