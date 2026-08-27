import java.util.*;
class vowels{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String text=sc.nextLine();
        int count=0;
        int len= text.length();
        for(int i=0;i<len;i++){
            Character ch=text.charAt(i);
           if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
              count+=1;
           }
        }
        System.out.println(count);
    }
}