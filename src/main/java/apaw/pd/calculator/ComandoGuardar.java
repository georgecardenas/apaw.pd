package apaw.pd.calculator;

import upm.jbb.IO;

public class ComandoGuardar extends Operation{
    private GestorMementos<Integer> gestorMementos;
    
    public ComandoGuardar(MementoCalculadora receptor, GestorMementos<Integer> gestorMementos) {
        super(receptor);
        this.gestorMementos = gestorMementos;
    }

    @Override
    public void execute() {
        this.gestorMementos.addMemento(IO.getIO().readString(), ((MementoCalculadora)this.receptor).crearMemento());
    }

    @Override
    public String name() {
        return "Comando Guardar";
    }

}
