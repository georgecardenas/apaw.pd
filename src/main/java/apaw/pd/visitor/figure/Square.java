package apaw.pd.visitor.figure;

public class Square extends Figure {

    private double side;

    public Square(String description, double side) {
        super(description);
        this.side = side;
    }
    
    public double getSide(){
        return side;
    }

    @Override
    public void accept(FiguresVisitor figuresVisitor) {
        figuresVisitor.visitSquare(this);
    }

}
