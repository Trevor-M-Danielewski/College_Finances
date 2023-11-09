package collegesavings;

public class WeeklyExpenses {
    // Reference to the MonthlyExpenses class for accessing monthly expense data
    private MonthlyExpenses monthlyInstance = new MonthlyExpenses();

    // Calculate the total weekly expenses
    public double calculateWeeklyExpenses() {

        // Calculate weekly biWeeklyPayment expenses by dividing the monthly amount by 2
        double biWeeklyPayment = monthlyInstance.biWeeklyPayment2 / 2;

        // Calculate weekly biWeeklyPayment2 expenses by dividing the monthly amount by 2
        double biWeeklyPayment2 = monthlyInstance.biWeeklyPayment2 / 2;

        // Calculate the total weekly expenses by summing the weekly expenses
        return biWeeklyPayment + biWeeklyPayment2;
    }
}
