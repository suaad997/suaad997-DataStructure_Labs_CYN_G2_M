package DoublyLinkedList;

public class DoublyLinkedList<E> {
private Node<E> head;
private Node<E> tail;
private int size=0;

public DoublyLinkedList() {
    head=new Node(null,null,null);
    tail=new Node(head,null,null);
    head.setNext(tail);

    }
public int size(){
        return size;
    }
public boolean isEmpty(){
        return size()==0;
    }

private void addBetween(Node<E> left,E data,Node<E> right ){
    Node<E> newNode=new Node(left,data,right);
    left.setNext(newNode);
    right.setPrev(newNode);
    size++;

}
public void addFirst(E data){
    addBetween(head,data,head.getNext());
}
public void addLast(E data){
        addBetween(tail.getPrev(),data,tail);
    }
private E remove(Node<E> deletedNode){
    if (isEmpty())return null;
    E delete=deletedNode.getData();
    Node<E> left=deletedNode.getPrev();
    Node<E> right=deletedNode.getNext();
    left.setNext(right);
    right.setPrev(left);
    size--;
    return delete;
}

public E removeFirst(){
    return remove(head.getNext());
}
public E removeLast(){
        return remove(tail.getPrev());
    }
public E getFirst(){
    if (isEmpty())return null;
    return head.getNext().getData();
}
public E getLast(){
        if (isEmpty())return null;
        return tail.getPrev().getData();
    }
public void display(){
if(isEmpty()){
    System.out.println("list is empty");
    return;
}

Node<E>temp=head.getNext();
    System.out.print("null<--head<--->");
while (temp!=tail){
    System.out.print(temp.getData()+"<--->");
    temp=temp.getNext();
}    System.out.println("tail<--->null");





}

class Node<E>{
private Node<E> prev;
private E data;
private Node<E> next;

    public Node(Node<E> prev, E data, Node<E> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

    public Node<E> getPrev() {
        return prev;
    }

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}



}
