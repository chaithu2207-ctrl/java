import java.util.*;
class person{
    void displayName(String name){
        System.out.println("name:"+name);
    }
}
class student extends person{
    void displayMarks(int marks){
        System.out.println("Marks:"+marks);
    }
}
class Main1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        student s1 =new student();
        System.out.println("Enter:");
        String name=sc.nextLine();
        int marks=sc.nextInt();
        s1.displayName(name);
        s1.displayMarks(marks);
    }
}