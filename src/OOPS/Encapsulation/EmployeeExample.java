package OOPS.Encapsulation;

class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;

    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Getter
    public double getSalary() {
        return salary;
    }

    // Setter with validation
    public void setSalary(double salary) {

        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    public void displayEmployee() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeExample {
    public static void main(String[] args) {

        Employee emp = new Employee(101, "Raj", 50000);

        emp.setSalary(60000);

        emp.displayEmployee();
    }
}
