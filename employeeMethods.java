public class employeeMethods{
    int age;
    String name;
    String role;
    employeeMethods(String name,int age,String role){
        this.name=name;
        this.age=age;
        this.role=role;
    }
    void display(){
        System.out.println("EMPLOYEE NAME: "+name);
        System.out.println("EMPLOYEE AGE: "+age);
        System.out.println("EMPLOYEE ROLE: "+role);
    }
    public static void main(String[]args){
       employeeMethods e1=new employeeMethods("john",45,"AI EnGINEER");
       employeeMethods e2=new employeeMethods("Rohan",25,"DS EnGINEER");
       employeeMethods e3=new employeeMethods("mohan",33,"DATA SCIENTIST");
       e1.display();
       e2.display();
       e3.display();
    }
}