package se.GroupAnimal;

public class Insurrance implements Insurable {
    private int deductibleAmount;
    private String policyNumber;
    private String policyHolderName;
    private double coverageAmount;

    public Insurrance(int deductibleAmount, String policyNumber, String policyHolderName, double coverageAmount) {
        this.deductibleAmount = deductibleAmount;
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.coverageAmount = coverageAmount;
    }

    @Override
    public double calculateMonthlyPayment() {
        // This is a simple example; actual calculation would be more complex
        double basePayment = 100.0; // Base monthly payment
        double coverageMultiplier = 0.02; // 2% of coverage amount
        double deductibleMultiplier = 0.005; // 0.5% of deductible amount

        double monthlyPayment = basePayment +
                (coverageAmount * coverageMultiplier) +
                (deductibleAmount * deductibleMultiplier);

        return monthlyPayment;
    }

    @Override
    public double calcualteDeductable() {
        this.deductibleAmount= (int) (0.1*coverageAmount);
        return 0;
    }

}
