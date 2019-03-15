package ac.za.cput;

public class Bus implements TransportInterface{
    @Override
    public int capacity() {
        return 20;
    }

    @Override
    public int numWheels() {
        return 6;
    }

    @Override
    public String showType() {
        return "Bus";
    }

    @Override
    public int maxSpeed() {
        return 120;
    }
}
