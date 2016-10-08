package apaw.pd.calculator;

public class PrintCommand extends Operation{

    public PrintCommand(Calculator receptor) {
        super(receptor);
    }

    @Override
    public void execute() {
        this.receptor.getTotal();
    }

    @Override
    public String name() {
        return "PrintCommand";
    }

}
