package Stack;

public class Main {
    public static void main(String[] args) {
        SLinkedStack<Integer> lstack=new SLinkedStack();
        lstack.push(10);
        lstack.push(20);
        lstack.push(30);
        lstack.push(40);
//        lstack.display();

        System.out.println("top is :"+lstack.top());
        while (!lstack.isEmpty()){
            System.out.println("element removed :"+lstack.pop());
        }



    }
}
