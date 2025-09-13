interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Student implements Printable, Showable {
    String name;
    int roll;
    double marks;

    Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public void print() {
        System.out.println("Printing Student Details...");
        System.out.println("Name: " + name + ", Roll: " + roll + ", Marks: " + marks);
    }

    @Override
    public void show() {
        System.out.println("Showing Student Information...");
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student("Saurabh", 101, 89.5);
        s.print();
        s.show();
    }
}
