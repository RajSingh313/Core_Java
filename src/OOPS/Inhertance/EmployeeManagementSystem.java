package OOPS.Inhertance;

// Parent Class
class Employee {

    int employeeId;
    String name;
    double salary;

    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Child Class
class Developer extends Employee {

    String programmingLanguage;

    Developer(int employeeId, String name, double salary, String programmingLanguage) {
        super(employeeId, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void showTechnology() {
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Another Child Class
class Manager extends Employee {

    int teamSize;

    Manager(int employeeId, String name, double salary, int teamSize) {
        super(employeeId, name, salary);
        this.teamSize = teamSize;
    }

    void manageTeam() {
        System.out.println("Managing Team Size: " + teamSize);
    }
}

// Main Class
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Developer dev = new Developer(101, "Raj", 120000, "Java");

        System.out.println("===== Developer Details =====");
        dev.displayEmployeeInfo();
        dev.showTechnology();

        System.out.println();

        Manager mgr = new Manager(201, "Aisha", 180000, 10);

        System.out.println("===== Manager Details =====");
        mgr.displayEmployeeInfo();
        mgr.manageTeam();
    }
}