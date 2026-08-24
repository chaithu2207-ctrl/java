import java.util.*;
class LargestNumber
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("a is the greatest number "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("b is the greatest number "+b);
        }
        else
        {
            System.out.println("c is the greatest number "+c);
        }
    }
}