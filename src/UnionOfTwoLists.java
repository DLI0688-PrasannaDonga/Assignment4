import java.util.*;
public class UnionOfTwoLists {
        public static void main(String[] args) {
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            ArrayList<Integer> list2 = new ArrayList<Integer>();

            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
            list1.add(5);

            list2.add(3);
            list2.add(9);
            list2.add(6);
            list2.add(1);
            list2.add(2);

            ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
            for(int i : list1){
                if(uniqueElements.contains(i))
                    continue;
                uniqueElements.add(i);
            }

            for(int i: list2){
                if(uniqueElements.contains(i))
                    continue;
                uniqueElements.add(i);
            }
            System.out.println(uniqueElements);
        }
    }
