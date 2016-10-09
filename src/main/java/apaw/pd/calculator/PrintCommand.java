package apaw.pd.calculator;

import upm.jbb.IO;

public class PrintCommand extends Operation{

    public PrintCommand(Calculator receptor) {
        super(receptor);
    }

    @Override
    public void execute() {
        IO.getIO().println(this.receptor.getTotal());
    }

    @Override
    public String name() {
        return "PrintCommand";
    }

}
