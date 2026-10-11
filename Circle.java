class C{
    double radius;
    C(double Radius){
        this.radius=Radius;
    }
    void Area(){
        System.out.println("Area= "+3.14*radius*radius);
    }
    void Circumference(){
        System.out.printf("Circumference=%.2f ",2*3.14*radius);
    }
}
class Circle{
   public static void main(String[]args){
    C c1 = new C(10);
    c1.Area();
    c1.Circumference();
   } 
}