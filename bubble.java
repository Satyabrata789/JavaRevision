import java.util.Scanner;

public class bubble{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        int [] array= new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println("]");

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++)
            {
                if (array[j]>array[j+1]) {
                    int temp=array[j];
                    array[j]=array[j+1];      
                    array[j+1]=temp;          
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]+", ");
        }
        sc.close();
    }
}