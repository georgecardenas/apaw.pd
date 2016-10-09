package apaw.pd.composite.expression;

public class Resta extends Operando {
    
    public Resta(Expresion expresion1, Expresion expresion2){
        super(expresion1, expresion2);
    }
    
    @Override
    public int operar() {
        return expresion1.operar() - expresion2.operar();
    }

    @Override
    protected String getOperador() {
        return "-";
    }
}
