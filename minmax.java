import java.util.*;
public class minmax{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n=sc.nextInt();
        int max=-1;
        int min=10;
        while(n>0){
            int d=n%10;
            if(d%2==0){
                max=Math.max(max,d);
            }
            else{
                min=Math.min(min,d);
            }
            n=n/10;
        }
        if(max==-1){
            System.out.println("NO EVEN VALUES");
        }
        else{
            System.out.println("MAXIMUM:"+max);
        }
        if(min==10){
            System.out.println("NO ODD VALUES");
        }
        else{
            System.out.println("MINIMUM:"+min);
        }
    }
}