package entities;

public class Company extends TaxPayer {

    private Integer employeeNumbers;

    public Company() {
        super();
    }

    public Company(Integer employeeNumbers, String name, Double annualIncome) {
        super(name, annualIncome);
        this.employeeNumbers = employeeNumbers;
    }

    public Integer getEmployeeNumbers() {
        return employeeNumbers;
    }

    public void setEmployeeNumbers(Integer employeeNumbers) {
        this.employeeNumbers = employeeNumbers;
    }

    @Override
    public double tax() {
        double tax = 0;
        if (getEmployeeNumbers() <= 10) {
            tax = 0.16;
        } else if (getEmployeeNumbers() > 10) {
            tax = 0.14;
        }
        return getAnnualIncome() * tax;
    }

}
