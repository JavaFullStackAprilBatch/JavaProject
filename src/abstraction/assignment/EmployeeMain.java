package abstraction.assignment;

public class EmployeeMain {
    public static void main(String[] args) {
        Manager m = new Manager("Nimisha", 2024, 50000);
        Developer d = new Developer("Shreyaan", 2025, 40000);
        Tester t = new Tester("Saanvi", 2026, 30000);
        m.displayDetails();
        d.displayDetails();
        t.displayDetails();

    }
}
