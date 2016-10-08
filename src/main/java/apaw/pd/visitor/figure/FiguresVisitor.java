package apaw.pd.visitor.figure;

public abstract class FiguresVisitor {
    
    public abstract void visitCircle(Circle circle);
    
    public abstract void visitSquare(Square square);
    
    public abstract void visitTriangle(Triangle triangle);
}
