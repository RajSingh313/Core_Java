package OOPS.Inhertance.Overloading;

class SalaryCalculator {

    // Basic salary
    double calculateSalary(double salary) {
        return salary;
    }

    // Salary with bonus
    double calculateSalary(double salary, double bonus) {
        return salary + bonus;
    }
}

public class EmployeeSalaryCalculation {
    public static void main(String[] args) {

        SalaryCalculator emp = new SalaryCalculator();

        System.out.println("Basic Salary: " + emp.calculateSalary(50000));
        System.out.println("Salary with Bonus: " + emp.calculateSalary(50000, 10000));
    }
}
