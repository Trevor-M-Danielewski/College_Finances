package collegesavings;

import java.util.*;

public class MonthlyExpenses {
    // Constants for various monthly expenses
    public final double cost = (Math.random() * 100);        // This is a substitute for layout
    public final double biWeeklyPayment2 = cost;             // BiWeekly payment
    public final double biWeeklyPayment = cost;              // BiWeekly payment
    public final double monthlyPayment1 = cost;              // Monthly payment
    public final double monthlyPayment2 = cost;              // Monthly payment
    public final double monthlyPayment3 = cost;              // Monthly payment
    public final double monthlyPayment4 = cost;              // Monthly payment
    public final double monthlyPayment5 = cost;              // Monthly payment
    public final double monthlyPayment6 = cost;              // Monthly payment
    private final double monthlyPayment7;                    // GAS & ELECTRIC BILL

    // Constructor for generating a random apartment gas and electric bill within the specified range
    public MonthlyExpenses() {
        this.monthlyPayment7 = generateRandomValue(cost, cost); // Min and Max parameters
    }

    // Method to generate a random value within a range
    private double generateRandomValue(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }

    // Calculate the total monthly expenses
    public double calculateMonthlyExpenses() {
        return monthlyPayment1 + monthlyPayment2 +
                monthlyPayment3 + monthlyPayment4 + monthlyPayment5 +
                (biWeeklyPayment2 * 2) + (biWeeklyPayment * 2) + monthlyPayment7 + monthlyPayment6;
    }
}
