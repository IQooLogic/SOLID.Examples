package rs.co.ast.ocp.example.bad;

/**
 *
 * @author IQooLogic
 */
public class AreaCalculator {

    public double Area(Rectangle[] shapes) {
        double area = 0;
        for(Shape shape : shapes) {
            if(shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                area += r.getWidth() * r.getHeight();
            } else /*if(shape instanceof Circle)*/ {
                Circle circle = (Circle) shape;
                area += circle.getRadius() * circle.getRadius() * Math.PI;
            }
        }
        return area;
    }

}
