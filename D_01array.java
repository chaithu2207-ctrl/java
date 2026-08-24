import java.util.*;
class D_array{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row:n=");
        int n=sc.nextInt();
         System.out.println("Enter the column:m=");
        int m=sc.nextInt();
        int a[][] =new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The values of array are:");
        for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
        }
    }
}