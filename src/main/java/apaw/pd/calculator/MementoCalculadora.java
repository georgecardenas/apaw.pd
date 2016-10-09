package apaw.pd.calculator;

public class MementoCalculadora extends Calculator implements CalculadoraMementable{

    public int crearMemento() {
        return this.getTotal();
    }

    public void restaurarMemento(int memento) {
        this.setTotal(memento);
    }
}
