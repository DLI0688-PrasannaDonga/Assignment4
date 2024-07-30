import java.util.*;
public class LinkedListImplement {
    Node head;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value= value;
            this.next=null;
        }
    }

    public void addEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null)
            temp=temp.next;
        temp.next=newNode;
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value+"  ");
            temp = temp.next;
        }
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedListImplement list = new LinkedListImplement();
        list.addEnd(2);
        list.addEnd(4);
        list.addEnd(6);
        list.addEnd(8);
        list.addEnd(10);
        list.deleteFirst();

        list.display();
    }
}