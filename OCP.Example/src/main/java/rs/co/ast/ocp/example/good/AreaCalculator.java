package rs.co.ast.ocp.example.good;

/**
 *
 * @author IQooLogic
 */
public class AreaCalculator {

    public double Area(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.area();
        }
        return area;
    }

}
