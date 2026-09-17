class student{
    String name;
    int age;
    void display(){
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
    }
} 
class classes{
    public static void main(String[]args){
        student s1=new student();
        s1.name="JOHN";
        s1.age=20;
        s1.display();
        student s2=new student();
        s2.name="KAVYA";
        s2.age=23;
        s2.display();
        student s3=new student();
        s3.name="HARSHITHA";
        s3.age=30;
        s3.display();
    }
}