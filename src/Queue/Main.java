package Queue;

public class Main  {
    public static void main(String[] args) {
        ArrayQueue <Integer> aQueue=new ArrayQueue<Integer>();
        aQueue.enqueue(10);
        aQueue.enqueue(20);
        aQueue.enqueue(30);
        aQueue.enqueue(40);
        aQueue.enqueue(50);
        System.out.println("the front is: "+aQueue.front());

        while (!aQueue.isEmpty()){
            System.out.println("element removed: "+aQueue.dequeue());

        }




    }
}
