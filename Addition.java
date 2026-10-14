class Addition{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    public void add(double a,double b){
        System.out.println(a+b);
    }
    public static void main(String[]args){
        Addition a=new Addition();
        a.add(4,5);
        a.add(3,4,5);
        a.add(2.0,4.0);
    }
}