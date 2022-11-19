package ss11_DSA_Stack_Queue.btap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackReverseArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        reverseNum();
        reverseStr();

    }

    private static void reverseNum() {
        Stack<Integer> stack= new Stack<>();
        Integer[] n={1,2,4,5,6,8, 54,32, 12};
        int size=n.length;
        for (int i = 0; i < size; i++) {
            stack.push(n[i]);
        }
        Integer[] reverse=new Integer[size];
        for (int i = 0; i < size; i++) {
            reverse[i]=stack.pop();
        }
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(reverse));
    }

    private static void reverseStr(){
        Stack<String> stack=new Stack<>();
        String mWord="hieu pro 123 chinh la anh";
        String[] res=mWord.split(" ");
        int size=res.length;
        for (int i = 0; i < size; i++) {
            stack.push(res[i]);
        }

        String[] reverse=new String[size];
        for (int i = 0; i < size; i++) {
            reverse[i]=stack.pop();
        }
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(reverse));
    }
}
