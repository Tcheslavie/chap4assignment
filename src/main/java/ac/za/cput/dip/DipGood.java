package ac.za.cput.dip;

import java.util.List;

public class DipGood {
    private List<Animal> animals;

    public DipGood(List<Animal> list)
    {
        this.animals = list;
    }

    public void start()
    {
        for(int i=0; i<animals.size(); i++) {
            animals.get(i).roar();
        }
    }

}
