package apaw.pd.visitor.figure;

public class Circle extends Figure {

    private double radius;

    public Circle(String description, double radius) {
        super(description);
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }

    @Override
    public void accept(FiguresVisitor figuresVisitor) {
        figuresVisitor.visitCircle(this);
    }

}
