package ac.za.cput;

public class Car implements TransportInterface {
    @Override
    public int maxSpeed() {
        return 240;
    }

    @Override
    public String showType() {
        return "Car";
    }

    @Override
    public int numWheels() {
        return 4;
    }

    @Override
    public int capacity() {
        return 5;
    }
}
