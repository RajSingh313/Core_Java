package OOPS.Constructor;

class Employee {

    String name;
    double salary;

    // Parameterized Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Copy Constructor
    Employee(Employee emp) {
        this.name = emp.name;
        this.salary = emp.salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        // Original Object
        Employee e1 = new Employee("Ali", 75000);

        // Copying Object
        Employee e2 = new Employee(e1);

        System.out.println("Original Object:");
        e1.display();

        System.out.println("\nCopied Object:");
        e2.display();
    }
}