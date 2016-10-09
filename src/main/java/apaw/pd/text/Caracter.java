package apaw.pd.text;

public class Caracter extends Texto{
    
    private char caracter;
    
    public Caracter (char caracter){
        this.caracter = caracter;
    }
    
    @Override
    public void add(Texto texto) {
        return;
    }

    @Override
    public void remove(Texto texto) {
        return;
    }

    @Override
    public String print(boolean mayus) {
        if (mayus){
            return String.valueOf(caracter).toUpperCase(); 
        }
        return String.valueOf(caracter);
    }

    @Override
    public boolean esCompuesto() {
        return false;
    }

}
