package assignment.constructor;

public class Student {
    String name;

    Student() {
        this.name = "Unknown";

    }

    Student(String name) {
        this.name = name;

    }

    public void display() {
        System.out.println("Name of the Student : " + name);

    }

    public static void main(String[] args) {
        Student S = new Student();
        Student S1 = new Student("Nimisha");
        S.display();
        S1.display();
    }
}
