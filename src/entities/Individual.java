package entities;

public class Individual extends TaxPayer {

    private Double healthExpends;

    public Individual() {
        super();
    }

    public Individual(Double healthExpends, String name, Double annualIncome) {
        super(name, annualIncome);
        this.healthExpends = healthExpends;
    }

    public Double getHealthExpends() {
        return healthExpends;
    }

    public void setHealthExpends(Double healthExpends) {
        this.healthExpends = healthExpends;
    }

    @Override
    public double tax() {
        double tax = 0;
        if (getAnnualIncome() < 20000.0) {
            tax = 0.15;
        } else if (getAnnualIncome() >= 20000.0) {
            tax = 0.25;
        }
        return (getAnnualIncome() * tax) - (getHealthExpends() * 0.5);

    }

}
