import java.util.*;
public class DuplicateElementsInArrayList{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        char ch;
        do{
            System.out.println("Enter element to add in the list");
            list.add(input.nextInt());
            System.out.println("Do you want to add more elements ?then enter y else n ");
            ch=input.next().charAt(0);
        }while(ch=='y');
        int count;
        for(int i=0;i<list.size();i++){
            count=1;
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    count++;
                    list.set(j,-1);
                }
            }
            if(count>1 && list.get(i)!=-1)
                System.out.println("Duplicate element "+list.get(i));
        }
    }
}