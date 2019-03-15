package ac.za.cput;

public class Job {

    private int salary;
    private String name;
    public Job(String type)
    {
        this.name = type;
        switch(type)
        {
            case "Painter":
                this.salary = 5000;
                break;
            case "Tailer":
                this.salary = 8000;
                break;
            default:
                this.salary=0;
                this.name = "None";
                break;
        }
    }

    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
}
