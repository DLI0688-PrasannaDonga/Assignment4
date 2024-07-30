import java.util.*;
public class MiddleNodeLList{
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addBeginning(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode=head;
        head=newNode;
    }

    public void addEnding(int data){
        Node newNode = new Node(data);
        Node temp=head;

        while(temp.next!=null)
            temp=temp.next;
        temp.next=newNode;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void middleElement(){
        int length=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        System.out.println(length);
        temp=head;
        int i=1;
        while (i<=(length/2)) {
            temp = temp.next;
            i++;
        }

        System.out.println("Middle element is: "+temp.data);

    }

    public static void main(String[] args) {
        MiddleNodeLList list = new MiddleNodeLList();
        list.addBeginning(2);
        list.addEnding(4);
        list.addEnding(6);
        list.addEnding(8);
        list.addEnding(10);
        list.addEnding(12);

        list.display();

        list.middleElement();
    }
}