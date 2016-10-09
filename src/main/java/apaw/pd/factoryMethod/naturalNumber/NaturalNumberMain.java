package apaw.pd.factoryMethod.naturalNumber;

import upm.jbb.IO;

public class NaturalNumberMain {
    private NaturalNumberCreator[] creadores = {new NaturalNumberEsCreator(), new NaturalNumberEnCreator()};

    private NaturalNumberCreator creador = creadores[0];
    
    public void tipoCreador() {
        this.creador = (NaturalNumberCreator) IO.getIO().select(creadores, "Elige un creador");
    }

    public void crearProducto() {
        IO.getIO().println("Creado producto: " + this.creador.createNaturalNumber(IO.getIO().readInt()).getTextValue());
    }

    public static void main(String[] args) {
        IO.getIO().addView(new NaturalNumberMain());
    }
}
