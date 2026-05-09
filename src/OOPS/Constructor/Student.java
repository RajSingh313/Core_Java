package OOPS.Constructor;

class Student {

    String name;
    int rollNo;

    // Default Constructor
    Student() {
        name = "Not Assigned";
        rollNo = 0;
    }

    // Parameterized Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }

    public static void main(String[] args) {

        // Using Default Constructor
        Student s1 = new Student();

        // Using Parameterized Constructor
        Student s2 = new Student("Raj", 101);

        System.out.println("Default Constructor Output:");
        s1.display();

        System.out.println("\nParameterized Constructor Output:");
        s2.display();
    }
}
