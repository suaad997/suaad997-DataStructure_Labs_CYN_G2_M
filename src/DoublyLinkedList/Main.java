package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dlist=new DoublyLinkedList<Integer>();
        dlist.addFirst(10);
        dlist.addFirst(20);
        dlist.addFirst(60);
        dlist.addFirst(50);
        dlist.display();
        dlist.addLast(40);
        dlist.addLast(30);
        dlist.removeFirst();
        dlist.removeLast();
        dlist.display();
    }
}
