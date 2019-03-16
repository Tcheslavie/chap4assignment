package ac.za.cput.ocp.ocpRight;

public class SalaryCalcEmp implements SalaryCalcInterface {
    @Override
    public int calcSalary(int hours) {
        return hours*12;
    }
}
