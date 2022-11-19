package ss10_DSA_danhsach.thuchanh;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList=new MyList<Integer>();
        myList.add(2);
        myList.add(5);
        myList.add(1);
        myList.add(6);
        myList.add(89);
        myList.add(89);

        System.out.println("element 4: "+myList.get(4));
        System.out.println("element 1: "+myList.get(1));
        System.out.println("element 2: "+myList.get(2));


//        myList.get(6);
//        System.out.println("element 6: "+myList.get(6));


        System.out.println(myList.get(2));

        System.out.println("element 2: " + myList.get(2));

        System.out.println(Arrays.toString(myList.getElement()));
    }
}
