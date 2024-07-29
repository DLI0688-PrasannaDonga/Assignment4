import java.util.Arrays;
import java.util.Scanner;
public class StringSearch {
    public static String stringSearch(String arr[], String str) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                return "Presents at index " + i;
                //System.out.println(i);

            }

        }
        return "-1";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length : ");
        int n= sc.nextInt();
        sc.nextLine();
        String[] arr= new String[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        System.out.println("Enter String to search");
        String str=sc.nextLine();
        String res=stringSearch(arr,str);
        System.out.println(res);
    }
}
