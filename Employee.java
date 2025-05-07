public class Employee {
    String name;
    int id;
    double salary;
    int age;

    // Modified constructor to accept age
    public Employee(String name, int id, double salary, int age) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age = age; // Assigning age
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Corrected syntax & added age
        Employee emp1 = new Employee("XYZ", 101, 500000.0, 30);
        emp1.displayInfo();
    }
}
