package rs.co.ast.isp.example.bad;

/**
 *
 * @author IQooLogic
 */
public class ToyHouse implements Toy {

    @Override
    public void setPrice(double price) {}

    @Override
    public void setColor(String color) {}

    @Override
    public void move() {}/* problem */

    @Override
    public void fly() {}/* problem */
    /*
    if we add more behaviors then all toys must implement then even though they do not need it
    */
    
}
