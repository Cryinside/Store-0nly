package ss10_DSA_danhsach.btap;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList=new MyList<>();
        myList.add(4);
        myList.add(2);
        myList.add(2);
        myList.add(1);
        myList.add(5);
        myList.add(66);

//        myList.clear();
//        myList.addElement(0,99);
//        myList.addElement(1,22);
        myList.add(3);
        myList.addElement(3,65);
//        myList.addElement(19,65);


            System.out.println(myList.size());
        System.out.println(Arrays.toString(myList.getValue()));

    }
}
