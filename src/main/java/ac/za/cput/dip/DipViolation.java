package ac.za.cput.dip;

public class DipViolation {
    private Dog dog = new Dog();
    private Cat cat = new Cat();

    public void start()
    {
        dog.run();
        cat.run();
    }
}
