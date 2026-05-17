
package OOPS.Relationships;

// Association means two classes are connected,
// but both can exist independently.

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach() {
        System.out.println(name + " is teaching.");
    }
}

// Student class
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void learn(Teacher teacher) {
        System.out.println(name + " is learning from " + teacher.name);
    }
}

// Main class
public class Association {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Mr. Ali");
        Student student = new Student("Raj");

        teacher1.teach();

        // Passing teacher object
        student.learn(teacher1);
    }
}

