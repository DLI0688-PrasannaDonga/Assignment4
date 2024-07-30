import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        char response;

        do {
            list.add(sc.nextInt());
            System.out.println("If you want to add more Enter y else n");
            response = sc.next().charAt(0);

        } while (response == 'y');
        ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
        for (int i : list) {
            if (uniqueElements.contains(i))
                continue;
            uniqueElements.add(i);
        }
        System.out.println(uniqueElements);
    }

}


