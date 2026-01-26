package Queue;

public interface Queue<E> {
    public boolean isEmpty();
    public int size();
    public void enqueue (E data);
    public E dequeue();
    public E front();
}
