import java.util.*;
class SwitchCase{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER THE DAY:");
       int day =sc.nextInt();
       switch(day){
        case 1:
            System.out.println("MONDAY");
            break;
        case 2:
            System.out.println("TUESDAY");
            break;
        case 3:
            System.out.println("WEDNESDAY");
            break;
        default:
            System.out.println("INVALID DAY");            
       } 
    } 
}