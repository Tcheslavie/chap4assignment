package ac.za.cput.ocp;

public class SalaryCalc {

    public SalaryCalc(){}

    public int calcSalary(int hours)
    {
        return hours*12;
    }

    public int calcSalarySenior(int hours)
    {
        return hours*18;
    }
}
