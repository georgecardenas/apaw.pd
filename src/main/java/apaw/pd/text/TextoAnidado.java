package apaw.pd.text;

public class TextoAnidado extends TextoCompuesto{

    @Override
    public void add(Texto texto) {
        if (texto.esCompuesto()){
            elementos.add(texto);
        }else{
            throw new UnsupportedOperationException("Esta operación no está permitida");
        }
    }

    @Override
    public void remove(Texto texto) {
        if (texto.esCompuesto()){
            elementos.remove(texto);
        }
    }

    @Override
    public String print(boolean mayus) {
        String result= "";
        for(Texto caracter : elementos){
            result += caracter.print(mayus);
        }
        result += "---o---\n";
        return result;
    }

    @Override
    public boolean esCompuesto() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
