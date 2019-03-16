package ac.za.cput.lsp;

public class BrokenCar extends Car {
    @Override
    public void drive() {
        throw new IllegalStateException("The car is broken");
    }
}
