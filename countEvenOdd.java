import java.util.*;
class countEvenOdd{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int even_count=0;
        int odd_count=0;
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
            even_count++;
           }
           else{
            odd_count++;
           }
        }
        System.out.println("EVEN COUNT IS: "+ even_count);
        System.out.println("ODD COUNT IS: "+ odd_count);
    }
}