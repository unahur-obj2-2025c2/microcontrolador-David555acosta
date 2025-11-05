package ar.unahur.edu.obj2.patroncommand.Excepciones;

public class FueraDeRangoException extends RuntimeException {
    public FueraDeRangoException(String msj) {
        super(msj);
    }
}
