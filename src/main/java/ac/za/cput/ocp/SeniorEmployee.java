package ac.za.cput.ocp;

public class SeniorEmployee {
    private SalaryCalc calc = new SalaryCalc();

    public SeniorEmployee(){}

    public int calculateSalary(int hours)
    {
        return calc.calcSalarySenior(12);
    }

}
