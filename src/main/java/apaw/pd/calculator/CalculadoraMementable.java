package apaw.pd.calculator;

public interface CalculadoraMementable {
    public int crearMemento();
    
    public void restaurarMemento(int memento);
}
