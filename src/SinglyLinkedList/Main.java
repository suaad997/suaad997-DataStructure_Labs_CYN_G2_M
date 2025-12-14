package SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list= new SinglyLinkedList<Integer>();
        list.addfirst(10);
        list.addfirst(20);
        list.addLast(50);
        list.removeLast();
        list.addAtPosition(80,3);
        list.addLast(40);
        list.display();

    }
}
