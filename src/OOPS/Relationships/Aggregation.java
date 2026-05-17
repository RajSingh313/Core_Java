package OOPS.Relationships;


import java.util.ArrayList;
import java.util.List;

// Teacher.java
class teacher {
    String name;

    teacher(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Teacher: " + name);
    }
}

// Department.java
class Department {
    String deptName;
    List<teacher> teachers;

    Department(String deptName) {
        this.deptName = deptName;
        teachers = new ArrayList<>();
    }

    void addTeacher(teacher teacher) {
        teachers.add(teacher);
    }

    void showTeachers() {
        System.out.println("Department: " + deptName);

        for (teacher t : teachers) {
            t.display();
        }
    }
}

// Main.java
public class Aggregation {
    public static void main(String[] args) {

        teacher t1 = new teacher("Ahmed");
        teacher t2 = new teacher("Sara");

        Department dept = new Department("Computer Science");

        dept.addTeacher(t1);
        dept.addTeacher(t2);

        dept.showTeachers();

        // Teachers still exist independently
        t1.display();
    }
}

