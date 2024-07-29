import java.util.Scanner;

public class FirstOccurrence {
    public static  String firstOccurance(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return "Occurrence at index "+i;
            }

        }
        return "-1";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter a number to search");
        int ele=sc.nextInt();
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }

        String res=firstOccurance(arr,ele);
        System.out.println(res);

    }
}
