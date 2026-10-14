class Bill{
    public void BP(double amt,double quantity){
        System.out.println(amt*quantity);
    }
    public void BP(int amt,double quantity){
         System.out.println(amt*quantity);        
    }
    public static void main(String[]args){
        Bill b1=new Bill();
        b1.BP(26.8,98.9);
        b1.BP(29,100.89);
    }
}