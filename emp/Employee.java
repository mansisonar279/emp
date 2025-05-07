public class Employee {
    String name;
    int id;
    double salary;
    int age;

    // Constructor with age parameter included
    public Employee(String name, int id, double salary, int age) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.age = age;
    
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("age: " + age);
        
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("XYZ", 101, 500000.0, 30); // Age parameter added
        emp1.displayInfo();
    }
}
