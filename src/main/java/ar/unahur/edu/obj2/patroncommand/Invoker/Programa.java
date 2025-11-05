package ar.unahur.edu.obj2.patroncommand.Invoker;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.Operables.ADD;
import ar.unahur.edu.obj2.patroncommand.Operables.LOD;
import ar.unahur.edu.obj2.patroncommand.Operables.LODV;
import ar.unahur.edu.obj2.patroncommand.Operables.NOP;
import ar.unahur.edu.obj2.patroncommand.Operables.Operable;
import ar.unahur.edu.obj2.patroncommand.Operables.STR;
import ar.unahur.edu.obj2.patroncommand.Operables.SWAP;
import ar.unahur.edu.obj2.patroncommand.Programabe.Programable;

public class Programa {
    private List<Operable> operaciones;

    public Programa() {
        operaciones = new ArrayList<>();
    }

    public void agregarOperacionNOP() {
        operaciones.add(new NOP());
    }

    public void agregarComandoADD() {
        operaciones.add(new ADD());
    }

    public void agregarSWAP() {
        operaciones.add(new SWAP());
    }

    public void agregarLOD(Integer direccionDeDmemora) {
        operaciones.add(new LOD(direccionDeDmemora));
    }

    public void agregarSTR(Integer direccionDeMemoria) {
        operaciones.add(new STR(direccionDeMemoria));
    }

    public void agregarLODV(Integer val) {
        operaciones.add(new LODV(val));
    }


    public void vaciarLista() {
        operaciones.clear();
    }


    public void run(Programable micro) {
        micro.run(operaciones);
    }

}
