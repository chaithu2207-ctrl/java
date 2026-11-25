class Employee {
    String name;
    int id;
    double salary;

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    double bonus;

    void calculateSalary() {
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.name = "Rahul";
        m.id = 101;
        m.salary = 40000;
        m.bonus = 10000;

        m.displayEmployee();
        m.calculateSalary();
    }
}
