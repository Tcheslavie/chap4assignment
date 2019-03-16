package ac.za.cput.lsp.lspRight;

import ac.za.cput.lsp.BrokenCar;

import java.util.ArrayList;
import java.util.List;

public class Dispatch {

    public void start(List<ac.za.cput.lsp.lspRight.Car> cars)
    {
        for(Car car:cars)
        {
            car.drive();
        }
    }

    public void prepare()
    {
        List<ac.za.cput.lsp.lspRight.Car> myList = new ArrayList<>();
        myList.add(new CarImpl());

        start(myList);
    }
}
