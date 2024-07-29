import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int[] arr =new int[n];
        int max=arr[0];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
           if(arr[i]>max){
               max=arr[i];
           }
        }
        System.out.println("max element "+max);
    }
}
