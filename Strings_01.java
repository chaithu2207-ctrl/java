import java.util.*;
class Strings_01{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        String s=sc.nextLine();
        System.out.println("Character at 5th location is: "+s.charAt(8));
        System.out.println("The length of String is: "+s.length());
        System.out.println("The upper case of String is: "+s.toUpperCase());
        System.out.println("The lower case of String is: "+s.toLowerCase()); 
        System.out.println(s.startsWith("he"));
        System.out.println(s.endsWith("va"));
        System.out.println(s.contains("lo"));
        System.out.println(s.substring(3,9));
        System.out.println(s.indexOf("o"));
   }
}