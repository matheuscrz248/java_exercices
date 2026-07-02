package poo.individualcompany.entities;

public class IndividualTaxpayer extends Taxpayer {

    private Double healthExp;

    public IndividualTaxpayer() {

    }

    public IndividualTaxpayer(String name, Double anualIncome, Double healthExp) {
        super(name, anualIncome);
        this.healthExp = healthExp;
    }

    public Double getHealthExp() {
        return healthExp;
    }

    public void setHealthExp(Double healthExp) {
        this.healthExp = healthExp;
    }

    @Override
    public Double calculateTax() {

        if (super.getAnualIncome() < 20.000) {
            return (super.getAnualIncome() * 0.15) - (healthExp * 0.5);
        }
        else {
            return (super.getAnualIncome() * 0.25) - (healthExp * 0.5);
        }

    }

}
