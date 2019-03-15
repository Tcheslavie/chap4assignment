package ac.za.cput;

public class Employee {
    private Job job;

    public Employee(String type)
    {
        job = new Job(type);
    }

    public int getSalary()
    {
        return job.getSalary();
    }

    public Job getJob()
    {
        return job;
    }
}
