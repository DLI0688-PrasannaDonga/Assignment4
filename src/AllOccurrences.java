import java.util.Scanner;

public class AllOccurrences {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array length : ");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the number you want find occurrences");
        int ele= sc.nextInt();
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

       for(int i=0;i<n;i++){
           if(arr[i]==ele){
               System.out.print(i+" ");
           }
       }
    }
}
