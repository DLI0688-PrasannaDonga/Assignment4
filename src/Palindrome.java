import java.util.*;
public class Palindrome{
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<Character>();

        list.add('a');
        list.add('d');
        list.add('m');
        list.add('a');
        list.add('m');

        int[] frequency = new int[list.size()];
        for(int i=0;i<list.size();i++){
            int count=1;
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)==list.get(j)){
                    count++;
                    list.set(j,'\u0000');
                }
            }
            if(list.get(i)!='\u0000')
                frequency[i]=count;
        }
        //System.out.println(Arrays.toString(frequency));
        int length=list.size();
        int evenCount=0,oddCount=0,k=0,count=0;
        if(length%2==0){
            for(int j=0;j<frequency.length;j++){
                if(frequency[j]%2!=0){
                    k=1;
                    System.out.println("Not Palindrome");
                    break;
                }

            }
            if(k==0) System.out.println("Palindrome");
        }
        else{
            for(int i=0;i<frequency.length;i++){
                if(frequency[i]%2==0)
                    evenCount++;
                else
                    oddCount++;
            }
            if((evenCount== frequency.length-1) &&(oddCount==1))
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }
}