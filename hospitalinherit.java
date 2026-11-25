class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor extends Person {
    String department;
    double fee;

    Doctor(String name, int age, String department, double fee) {
        super(name, age);
        this.department = department;
        this.fee = fee;
    }

    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Consultation Fee: " + fee);
    }
}

class SpecialistDoctor extends Doctor {
    double extraFee;

    SpecialistDoctor(String name, int age, String department,
                     double fee, double extraFee) {
        super(name, age, department, fee);
        this.extraFee = extraFee;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Extra Fee: " + extraFee);
        System.out.println("Total Fee: " + (fee + extraFee));
    }
}

public class Main {
    public static void main(String[] args) {
        SpecialistDoctor d = new SpecialistDoctor(
            "Arjun", 40, "Cardiology", 1000, 500
        );

        d.display();
    }
}
