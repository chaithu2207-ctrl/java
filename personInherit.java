class Person {
    void displayPerson() {
        System.out.println("This is a person");
    }
}

class Employee extends Person {
    void displayEmployee() {
        System.out.println("This is an employee");
    }
}

class Manager extends Employee {
    void displayManager() {
        System.out.println("This is a manager");
    }
}

class personInherit{
    public static void main(String[] args) {
        Manager m = new Manager();

        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}