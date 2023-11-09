package collegesavings;

/**
 * Client Class for College Savings
 *
 * Author: Trevor M. Danielewski
 * Date Created: 8/11/23
 *
 * This program is used to help me calculate my expenses when I am working during the semester
 * and when I am working during my school breaks. Yet it can be adjusted and used for anyone's
 * personal finances.
 *
 * [NOTE: FOR PRIVACY REASONS INFORMATION HAS BEEN REMOVED]
 *
 */

public class Client {
    public static void main(String[] args) {
        // Create instances of income and expenses
        WeeklyIncomeSemester academicIncome = new WeeklyIncomeSemester();
        WeeklyIncomeSchoolBreak nonAcademicIncome = new WeeklyIncomeSchoolBreak();
        MonthlyExpenses monthlyExpenses = new MonthlyExpenses();
        WeeklyExpenses weeklyExpenses = new WeeklyExpenses();

        // Display semester finances for semester income
        displayFinances(academicIncome, monthlyExpenses, weeklyExpenses);

        // Display school break finances for school break income
        displayFinances(nonAcademicIncome, monthlyExpenses, weeklyExpenses);
    }

    // A common method to display income, expenses, and savings for semester income
    private static void displayFinances(WeeklyIncomeSemester income, MonthlyExpenses monthlyExpenses, WeeklyExpenses weeklyExpenses) {
        System.out.println("\n================ [" + "Semester Finances" + "] ================");
        double weeklyIncome = income.calculatePaycheck();
        double monthlyIncome = weeklyIncome * 4;
        double expenses = monthlyExpenses.calculateMonthlyExpenses();
        double weeklyExp = weeklyExpenses.calculateWeeklyExpenses();
        double savings = monthlyIncome - expenses;

        System.out.println("Weekly Income: " + String.format("%.2f", weeklyIncome));
        System.out.println("Weekly Expenses: " + String.format("%.2f", weeklyExp));
        System.out.println("Monthly Income: " + String.format("%.2f", monthlyIncome));
        System.out.println("Monthly Expenses: " + String.format("%.2f", expenses));
        System.out.println("Monthly Savings: " + String.format("%.2f", savings));
    }

    // A common method to display income, expenses, and savings for school break income
    private static void displayFinances(WeeklyIncomeSchoolBreak income, MonthlyExpenses monthlyExpenses, WeeklyExpenses weeklyExpenses) {
        System.out.println("\n================ [" + "School Break Finances" + "] ================");
        double weeklyIncome = income.calculatePaycheck();
        double monthlyIncome = weeklyIncome * 4;
        double expenses = monthlyExpenses.calculateMonthlyExpenses();
        double weeklyExp = weeklyExpenses.calculateWeeklyExpenses();
        double savings = monthlyIncome - expenses;

        System.out.println("Weekly Income: " + String.format("%.2f", weeklyIncome));
        System.out.println("Weekly Expenses: " + String.format("%.2f", weeklyExp));
        System.out.println("Monthly Income: " + String.format("%.2f", monthlyIncome));
        System.out.println("Monthly Expenses: " + String.format("%.2f", expenses));
        System.out.println("Monthly Savings: " + String.format("%.2f", savings));
    }
}
