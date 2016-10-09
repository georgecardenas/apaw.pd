package apaw.pd.calculator;

public class ResetCommand extends Operation{

    public ResetCommand(Calculator receptor) {
        super(receptor);
    }

    @Override
    public void execute() {
        this.receptor.reset();
    }

    @Override
    public String name() {
        return "COmando Reset";
    }

}
