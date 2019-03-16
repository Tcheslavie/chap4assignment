package ac.za.cput.ocp;

public class Employee {
    private SalaryCalc calc = new SalaryCalc();
    public Employee(){}

    public int calculateSalary(int hours)
    {
        return calc.calcSalary(12);
    }
}
