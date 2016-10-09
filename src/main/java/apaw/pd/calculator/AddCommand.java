package apaw.pd.calculator;

import upm.jbb.IO;

public class AddCommand extends Operation{

    public AddCommand(Calculator receptor) {
        super(receptor);
    }

    @Override
    public void execute() {
        this.receptor.add(IO.getIO().readInt());
    }

    @Override
    public String name() {
        return "AddCommand";
    }

}
