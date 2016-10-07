package apaw.pd.composite.expression;

public abstract class Operando extends Expresion{
    
    protected Expresion expresion1;
    protected Expresion expresion2;
    
    public Operando(Expresion expresion1, Expresion expresion2){
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    public abstract int operar();
    
    protected abstract String getOperador();
    
    public String toString(){
        return "(" + expresion1.toString() + getOperador() + expresion2.toString() + ")";
    }
}
