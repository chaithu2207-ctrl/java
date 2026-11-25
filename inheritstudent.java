class Student {
    String name;
    int rollNo;

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class Marks extends Student {
    int m1, m2, m3;

    void calculateMarks() {
        System.out.println("Total Marks: " + (m1 + m2 + m3));
    }
}

class Result extends Marks {
    void calculatePercentage() {
        double percentage = (m1 + m2 + m3) / 3.0;
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result();

        r.name = "Harsha";
        r.rollNo = 25;
        r.m1 = 85;
        r.m2 = 90;
        r.m3 = 80;

        r.displayStudent();
        r.calculateMarks();
        r.calculatePercentage();
    }
}
