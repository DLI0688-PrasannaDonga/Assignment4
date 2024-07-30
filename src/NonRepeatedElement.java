import java.util.*;
public class NonRepeatedElement{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(2);
        list.add(34);
        list.add(1);
        list.add(2);

        for(int i=0;i<list.size();i++){
            int count=1;
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    count++;
                    list.set(j,-1);
                }
            }
            if(count==1){
                System.out.println("First non-repeated element is: "+list.get(i));
                break;
            }
        }
    }
}

