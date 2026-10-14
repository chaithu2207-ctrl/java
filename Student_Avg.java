class Student_Avg{
    public void avg(double a,double b){
        System.out.println((a+b)/2);
    }
    public void avg(double a,double b,double c){
        System.out.println((a+b+c)/3);
    }
    public static void main(String[]args){
       Student_Avg s1=new Student_Avg();
       s1.avg(4.0,5.0);
       s1.avg(44.7,34.2,21.8);
    }
}