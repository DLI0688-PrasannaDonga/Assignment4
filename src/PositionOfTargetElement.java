import java.util.Scanner;

public class PositionOfTargetElement {
    public static int targetElement(int arr[], int ele){
        int start=0;
        int last=arr.length-1;
        while(start<=last){
            int mid=(start+last)/2;
            if(arr[mid]<ele){
                start=mid+1;
            }
            else if(arr[mid]>ele){
                last=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the array length");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements in sorted order");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the target element");
        int ele=sc.nextInt();

        int res=targetElement(arr, ele);
        System.out.println(res);

    }
}
