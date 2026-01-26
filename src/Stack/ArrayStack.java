package Stack;

public class ArrayStack<E> implements Stack<E> {
    private E arr[];
    private int t=-1;
    private static final int CAPICITY=1000;

    public ArrayStack() {
       this(CAPICITY) ;
    }
    public ArrayStack(int c) {
        arr=(E[])new Object[c];
    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public void push(E data) {
        if(size()== arr.length){
           System.out.println("Cant add more, Stack is full");
         //  throw new IllegalStateException("Cant add more, Stack is full");
        }
        else {
            arr[++t]=data;
        }


    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E delete=arr[t];
        arr[t]=null;
        t--;
        return delete;
    }

    @Override
    public E top() {
        if (isEmpty())return null;
        return arr[t];
    }
}
