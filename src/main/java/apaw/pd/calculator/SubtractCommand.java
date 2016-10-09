package apaw.pd.calculator;

import upm.jbb.IO;

public class SubtractCommand extends Operation{

    public SubtractCommand(Calculator receptor) {
        super(receptor);
    }

    @Override
    public void execute() {
        this.receptor.subtract(IO.getIO().readInt());
    }

    @Override
    public String name() {
        return "SubtractCommand";
    }

}
