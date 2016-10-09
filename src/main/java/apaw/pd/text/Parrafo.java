package apaw.pd.text;

public class Parrafo extends TextoCompuesto{
    @Override
    public void add(Texto texto) {
        if (!texto.esCompuesto()){
            elementos.add(texto);
        }else{
            throw new UnsupportedOperationException("Esta operación no está permitida");
        }
    }

    @Override
    public void remove(Texto texto) {
        if (!texto.esCompuesto()){
            elementos.remove(texto);
        }
    }

    @Override
    public String print(boolean mayus) {
        String result= "";
        for(Texto caracter : elementos){
            result += caracter.print(mayus);
        }
        result += "\n";
        return result;
    }

    @Override
    public boolean esCompuesto() {
        return true;
    }
}
