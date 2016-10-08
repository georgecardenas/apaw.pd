package apaw.pd.visitor.figure;

public class NumberOfSides extends FiguresVisitor{
    
    private double numberOfSides;

    @Override
    public void visitCircle(Circle circle) {
        numberOfSides= numberOfSides + Double.POSITIVE_INFINITY;
    }

    @Override
    public void visitSquare(Square square) {
        numberOfSides= numberOfSides + 4;
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        numberOfSides= numberOfSides + 3;
    }
    
    public double getTotalNumberOfSides(){
        return numberOfSides;
    }

}
