package apaw.pd.visitor.figure;

public class Area extends FiguresVisitor{
    
    private double area;

    @Override
    public void visitCircle(Circle circle) {
        area = area +  Math.PI * circle.getRadius() * circle.getRadius();
    }

    @Override
    public void visitSquare(Square square) {
        area = area +  square.getSide() * square.getSide();
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        area = area +  triangle.getBase() * triangle.getHeight() * 0.5;
    }
    
    public double getTotalArea(){
        return area;
    }

}
