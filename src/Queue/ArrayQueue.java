package Queue;

public class ArrayQueue<E>  implements Queue<E> {
    private E arr[];
    private int f=0;
    private static final int CAPICITY=1000;
    private int size=0;

    public ArrayQueue() {
        this(CAPICITY) ;
    }
    public ArrayQueue(int c) {
        arr=(E[])new Object[c];
    }



    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void enqueue(E data) {
        if(size()== arr.length){
            System.out.println("Cant add more, Queue is full");
            //  throw new IllegalStateException("Cant add more, Stack is full");
        }
        else {
            int av=(f+size)% arr.length;
            arr[av]=data;
            size++;
        }
    }

    @Override
    public E dequeue() {
       if (isEmpty())return null;
       E delete=arr[f];
       arr[f]=null;
       f=f+1;
       if (f== arr.length)
           f=0;
       size--;
       return delete;
    }

    @Override
    public E front() {
       if (isEmpty())return null;
       return arr[f];
    }
}
