package Stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> lstack=new ArrayStack<Integer>(3);
      //  DLinkedStack<Integer> l2stack=new DLinkedStack<Integer>();

        lstack.push(10);
        lstack.push(20);
        lstack.push(30);
        lstack.push(40);

        System.out.println("top is :"+lstack.top());
        while (!lstack.isEmpty()){
            System.out.println("element removed :"+lstack.pop());
        }






    }
}
