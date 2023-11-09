package collegesavings;

public class WeeklyIncomeSchoolBreak {
    // Reference to the WeeklyIncomeSemester class for accessing income constants
    private WeeklyIncomeSemester academicInstance = new WeeklyIncomeSemester();

    // Calculate the weekly paycheck for school break
    public double calculatePaycheck() {
        // Calculate Gross Income by multiplying hourly rate and the number of hours worked
        double grossIncome = academicInstance.hourlyRate * (Math.random() * 40);

        // Calculate Tax Deduction based on the estimated tax percentage
        double taxDeduction = (academicInstance.estimatedTax / 100.0) * grossIncome;

        // Calculate Net Income (Final Paycheck) by subtracting tax deduction
        double netIncome = grossIncome - taxDeduction;

        return netIncome;  // Return the net income after calculations
    }
}
