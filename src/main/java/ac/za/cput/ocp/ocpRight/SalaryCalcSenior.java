package ac.za.cput.ocp.ocpRight;

public class SalaryCalcSenior implements SalaryCalcInterface{
    @Override
    public int calcSalary(int hours) {
        return hours*16;
    }
}
