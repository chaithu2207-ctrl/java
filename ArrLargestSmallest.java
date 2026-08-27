import java.util.*;
class ArrLargestSmallest{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF AN ARRAY");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int largest=a[0];
        System.out.println("THE LARGEST NUMBER IS:");
        for(int i=0;i<n;i++){
            if(largest<a[i]){
                largest=a[i];
            }
         }
         System.out.println(largest);
         System.out.println("THE SMALLEST NUMBER IS:");
         int smallest=a[0];
         for(int i=0;i<n;i++){
            if(smallest>a[i]){
                smallest=a[i];
            }
         }
         System.out.println(smallest);
    } 
}