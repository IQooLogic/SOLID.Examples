package rs.co.ast.dip.example.good;

/**
 *
 * @author IQooLogic
 */
public class Fan implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
