package collegesavings;

public class WeeklyIncomeSemester {
    // Constants for weekly semester income
    public final double hourlyRate = (Math.random() * 100);      // Hourly rate Random number for privacy
    public final double estimatedTax = 14.40;                   // Estimated tax percentage

    // Public non-static method for calculating the weekly paycheck during the semester
    public double calculatePaycheck() {
        // Calculate Gross Income by multiplying hourly rate and the number of hours worked
        double grossIncome = hourlyRate * (Math.random() * 40);

        // Calculate Tax Deduction based on the estimated tax percentage
        double taxDeduction = (estimatedTax / 100.0) * grossIncome;

        // Calculate Net Income (Final Paycheck) by subtracting tax deduction
        double netIncome = grossIncome - taxDeduction;

        return netIncome;  // Return the net income after calculations
    }
}
