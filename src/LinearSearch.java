import java.util.Scanner;

public class LinearSearch {
    public static String linearSearch(int arr[], int searchEle) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchEle) {
                return "presents in index "+ i;
            }
        }
        return "-1";

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the legth of array");
        int n=sc.nextInt();
        System.out.println("Enter search element");
        int searchEle=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        String res=linearSearch(arr, searchEle);
        System.out.println(res);




    }
}