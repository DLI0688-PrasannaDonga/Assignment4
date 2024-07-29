import java.util.Scanner;

public class NonDuplicateCharacters {
    public static int nonDuplicateCharacter(String str,char ch){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= sc.nextLine();
        int[] arr=new int[str.length()];
        for(int i=0;i<str.length();i++)
            arr[i] = nonDuplicateCharacter(str,str.charAt(i));
        //System.out.println(res);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
