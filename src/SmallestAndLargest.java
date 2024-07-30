import java.util.*;
public class SmallestAndLargest {
    public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<Integer>();

                list.add(90);
                list.add(25);
                list.add(49);
                list.add(14);
                list.add(89);

                int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
                for(int i=0;i<list.size();i++){
                    if(list.get(i)>max)
                        max=list.get(i);
                    if(list.get(i)<min)
                        min=list.get(i);
                }

                System.out.println("Maximum: "+max);
                System.out.println("Minimum: "+min);

            }
        }

