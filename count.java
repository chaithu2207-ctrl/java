import java.util.*;
class count{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE STRING:");
        String str=sc.nextLine();
        int countU=0;
        int countl=0;
        int counts=0;
        int countd=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                countU++;
            }
            else if(Character.isLowerCase(ch)){
                countl++;
            }
             else if(Character.isDigit(ch)){
                countd++;
            }
             else if(Character.isWhitespace(ch)){
                counts++;
            }
        }
        System.out.println("The count of Uppercase is: "+countU);
        System.out.println("The count of Lowercase is: "+countl);
        System.out.println("The count of Space is: "+counts);
        System.out.println("The count of didgits is: "+countd);
   }
}