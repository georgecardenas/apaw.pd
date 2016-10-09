package apaw.pd.calculator;

import upm.jbb.IO;

public class ComandoDeshacer extends Operation{
    private GestorMementos<Integer> gestorMementos;
    
    public ComandoDeshacer(MementoCalculadora receptor, GestorMementos<Integer> gestorMementos) {
        super(receptor);
        this.gestorMementos = gestorMementos;
    }

    @Override
    public void execute() {
        if (gestorMementos.keys().length <= 0){
            return;
        }
        
        int memento = this.gestorMementos.getMemento((String)IO.getIO().select(gestorMementos.keys()));
        ((MementoCalculadora)this.receptor).restaurarMemento(memento);
    }

    @Override
    public String name() {
        return "Comando Deshacer";
    }

}
