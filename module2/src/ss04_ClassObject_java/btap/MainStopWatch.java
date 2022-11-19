package ss04_ClassObject_java.btap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MainStopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassStopWatch stopWatch=new ClassStopWatch();
        long start=stopWatch.getStartTime();
        System.out.println(start);



        int[] array = {2,56,88,3,17};




        for(int i = 0; i<array.length-1;i++) {
            int index = i;
            for(int j =i+1;j<array.length;j++) {
                if (array[j] < array[index]) index = j;
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        System.out.println("Array is " + Arrays.toString(array));

        long end=stopWatch.getEndTime();
        System.out.println(end);
        System.out.println("Elapsed time is " + stopWatch.getElapsedTime());
    }
}
