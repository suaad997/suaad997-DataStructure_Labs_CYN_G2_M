package CirculyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> clist=new CircularLinkedList<>();
        clist.addFirst("Gamdan");
        clist.addFirst("Ali");
        clist.addFirst("Emad");
        clist.addLast("Iss ALdain");
        clist.addLast("Abdu");
        clist.removeFirst();
        clist.removeLast();
        clist.display();




    }
}
