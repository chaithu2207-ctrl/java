import java.util.*;
class calculator
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("THE ADDITON OF TWO NUMBERS IS: "+(a+b));
        System.out.println("THE SUBTRACTION OF TWO NUMBERS IS: "+(a-b));
        System.out.println("THE MULTIPLICATION OF TWO NUMBERS IS: "+(a*b));
        System.out.println("THE DIVISION OF TWO NUMBERS IS: "+(a/b));
    } 
}