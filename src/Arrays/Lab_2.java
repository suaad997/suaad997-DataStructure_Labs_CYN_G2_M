package Arrays;

public class Lab_2 {
    public static void main(String[] args) {
        //3   Scanner scanner=new Scanner(System.in);
        Array arr =new Array();
        //int []numbers={1,2,3,5};
        int []numbers=new int[3];
        arr.input(numbers);
        arr.traversal2(numbers);

        arr.traversal(numbers);



        arr.revers_traversal(numbers);


        //System.out.println(Arrays.toString(numbers));

//        for (int i=0; i<numbers.length;i++)
//            System.out.println(numbers[i]);

//        for(int num :numbers)
//            System.out.println(num);
//


    }
}
