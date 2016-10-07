package apaw.pd.composite.expression;

public class Suma extends Expresion {

    private Expresion expresion1;
    private Expresion expresion2;
    
    public Suma(Expresion expresion1, Expresion expresion2) {
        this.expresion1 = expresion1;
        this.expresion2 = expresion2;
    }

    @Override
    public int operar() {
        return expresion1.operar() + expresion2.operar();
    }
    
    @Override
    public String toString(){
        return "(" + expresion1.toString() + "+" + expresion2.toString() + ")";
    }

}
