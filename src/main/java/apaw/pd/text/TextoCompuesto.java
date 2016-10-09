package apaw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class TextoCompuesto extends Texto{

    protected List<Texto> elementos;

    public TextoCompuesto() {
        elementos = new ArrayList<>();
    }
    
    @Override
    public abstract void add(Texto texto);

    @Override
    public abstract void remove(Texto texto);

    @Override
    public abstract String print(boolean mayus);
}
