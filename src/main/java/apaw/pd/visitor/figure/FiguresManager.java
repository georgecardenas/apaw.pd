package apaw.pd.visitor.figure;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

    private List<Figure> figures;

    public FiguresManager() {
        figures = new ArrayList<>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public double totalArea() {
        Area area = new Area();
        
        for (Figure figure : figures) {
            figure.accept(area);
        }
        return area.getTotalArea();
    }

    public double totalNumberOfSides() {
        NumberOfSides numberOfSides = new NumberOfSides();
        
        for (Figure figure : figures) {
            figure.accept(numberOfSides);
        }
        return numberOfSides.getTotalNumberOfSides();
    }

}
