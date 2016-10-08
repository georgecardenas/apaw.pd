package apaw.pd.calculator;

public class SubtractCommand extends Operation{

    public SubtractCommand(Calculator receptor) {
        super(receptor);
    }

    @Override
    public void execute() {
        this.receptor.subtract(1);
    }

    @Override
    public String name() {
        return "SubtractCommand";
    }

}
