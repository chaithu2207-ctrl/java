class Employee {
    void displayCompany() {
        System.out.println("Employee works in a company");
    }
}

class Teacher extends Employee {
    void teach() {
        System.out.println("Teacher is teaching");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer is writing code");
    }
}

class employeeInherit {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Developer d = new Developer();

        t.displayCompany();
        t.teach();

        d.displayCompany();
        d.writeCode();
    }
}