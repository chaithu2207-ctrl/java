public class employeeNoConst{
    int age;
    String name;
    String role;
    void display(){
        System.out.println("EMPLOYEE NAME: "+name);
        System.out.println("EMPLOYEE AGE: "+age);
        System.out.println("EMPLOYEE ROLE: "+role);
    }
    public static void main(String[]args){
       employeeNoConst e1=new employeeNoConst();
       employeeNoConst e2=new employeeNoConst();
       e1.name="john";
       e1.age=43;
       e1.role="DATA SCIENTIST";
       e2.name="ria";
       e2.age=33;
       e2.role="AI ENGINEER";
       e1.display();
       e2.display();
       
    }
}