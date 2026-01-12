package Stack;

import SinglyLinkedList.SinglyLinkedList;

public class SLinkedStack<E> implements Stack<E> {
    SinglyLinkedList<E> slist=new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return  slist.isEmpty() ;
    }

    @Override
    public int size() {
        return slist.size();
    }

    @Override
    public void push(E data) {
       slist.addfirst(data);
    }

    @Override
    public E pop() {
        return slist.removeFirst();
    }

    @Override
    public E top() {
        return slist.getFirst();
    }
//    public void display(){    //not necessary
//        slist.display2();
//    }


}
