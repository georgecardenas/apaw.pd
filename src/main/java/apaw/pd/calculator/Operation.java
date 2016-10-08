package apaw.pd.calculator;

public abstract class Operation implements Comando{

    protected Calculator receptor;
    
    public Operation(Calculator receptor){
        this.receptor = receptor;
    }
    
    @Override
    public abstract void execute();

    @Override
    public abstract String name();

}
