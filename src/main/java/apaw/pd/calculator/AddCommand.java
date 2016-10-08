package apaw.pd.calculator;

public class AddCommand extends Operation{

    public AddCommand(Calculator receptor) {
        super(receptor);
    }

    @Override
    public void execute() {
        this.receptor.add(1);
    }

    @Override
    public String name() {
        return "AddCommand";
    }

}
