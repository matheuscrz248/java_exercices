package poo.individualcompany.entities;

public class CompanyTaxpayer extends Taxpayer {

    private Integer employeesNumber;

    public CompanyTaxpayer() {
        super();
    }

    public CompanyTaxpayer(String name, Double anualIncome, Integer employeesNumber) {
        super(name, anualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double calculateTax() {

        if (employeesNumber >= 10) {
            return super.getAnualIncome() * 0.14;
        }
        else {
            return super.getAnualIncome() * 0.16;
        }

    }

}
