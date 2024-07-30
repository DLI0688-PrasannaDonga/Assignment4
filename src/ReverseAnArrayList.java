import java.util.*;

public class ReverseAnArrayList {
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            int start=0,end=list.size()-1;
            while(start<=end){
                int temp=list.get(start);
                list.set(start,list.get(end));
                list.set(end,temp);

                start++;
                end--;
            }
            for(int i: list)
                System.out.println(i);
        }
    }


