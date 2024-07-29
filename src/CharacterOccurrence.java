import java.util.Scanner;

public class CharacterOccurrence {
    public static int characterOccurrence(String str, char character){
        int count=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==character){
                count++;

            }

        }
       return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a character :");
        char character=sc.next().charAt(0);
        System.out.println("Enter a String :");
        sc.nextLine();
        String str=sc.nextLine();
        int res=characterOccurrence(str,character);
        System.out.println(res);
    }
}
