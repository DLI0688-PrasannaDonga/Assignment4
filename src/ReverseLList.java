import java.util.*;
public class ReverseLList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
        if (head == null || head.next == null)
            return;

        Node prevNode = head;
        Node currentNode = head.next;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public static void main(String[] args) {

        ReverseLList list = new ReverseLList();
        list.addEnd(2);
        list.addEnd(4);
        list.addEnd(6);
        list.addEnd(8);
        list.addEnd(10);

        list.display();

        list.reverse();
        list.display();
    }

}