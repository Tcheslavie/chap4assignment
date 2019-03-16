package ac.za.cput.lsp;

import java.util.ArrayList;
import java.util.List;

public class Dispatch {

    public void start(List<Car> cars)
    {
        for(Car car:cars)
        {
            car.drive();
        }
    }

    public void prepare()
    {
        List<Car> myList = new ArrayList<>();
        myList.add(new Car());
        myList.add(new BrokenCar());

        start(myList);
    }
}
