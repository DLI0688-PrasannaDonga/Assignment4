import java.util.Scanner;
public class SelectionSort {
    public static void sorting(int arr[]){

        for(int i=0;i<arr.length;i++){
            int max=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[max]){
                    max=j;
                }
            }
            int temp=arr[max];
            arr[max]=arr[i];
            arr[i]=temp;
        }


    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        sorting(arr);
        printArray(arr);


    }
}
