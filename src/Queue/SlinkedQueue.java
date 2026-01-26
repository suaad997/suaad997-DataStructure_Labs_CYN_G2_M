package Queue;

import SinglyLinkedList.SinglyLinkedList;

public class SlinkedQueue <E> implements Queue<E> {
    SinglyLinkedList<E> slist=new SinglyLinkedList<E>();

    @Override
    public boolean isEmpty() {
        return slist.isEmpty();
    }

    @Override
    public int size() {
        return slist.size();
    }

    @Override
    public void enqueue(E data) {
        slist.addLast(data);
    }

    @Override
    public E dequeue() {
        return slist.removeFirst();
    }

    @Override
    public E front() {
        return slist.getFirst();
    }
}
