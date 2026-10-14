class Area{
    public void area(int s){
        System.out.println(s*s);
    }
    public void area(int a,int b){
        System.out.println(a*b);
    }
    public void area(double r){
        System.out.println(3.14*r*r);
    }
    public static void main(String[]args){
        Area a1=new Area();
        a1.area(4);
        a1.area(3,5);
        a1.area(10.0);
    }
}