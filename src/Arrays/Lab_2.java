package Arrays;

import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Array arr =new Array();
        int []numbers={1,2,3,4,5};

        System.out.println("enter number to search:");
        int value=scanner.nextInt();

        //  arr.update(numbers,3,7);
        //  arr.delete(numbers,3);
        // int result= arr.LinearSearch(numbers,2);
        int result=arr.BinarySearch(numbers,0,5,value);
        if(result!=-1)
            System.out.println("your value found at index :"+result);
        else
            System.out.println("index not found");




        //int []numbers=new int[3];
       // arr.input(numbers);
       // arr.traversal2(numbers);

        //arr.traversal(numbers);



        //arr.revers_traversal(numbers);


        //System.out.println(Arrays.toString(numbers));

//        for (int i=0; i<numbers.length;i++)
//            System.out.println(numbers[i]);

//        for(int num :numbers)
//            System.out.println(num);
//


    }
}
