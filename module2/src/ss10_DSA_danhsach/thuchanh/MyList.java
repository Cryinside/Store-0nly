package ss10_DSA_danhsach.thuchanh;

import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private  static final int DEFAULT_CAPACITY = 5;
    private Object element[];

    public MyList() {
        element=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize=element.length*2;
        element= Arrays.copyOf(element, newSize);
//        for (int i = 0; i <element.length ; i++) {
//            newSize[i]=element[i];
//        }
    }
    public void add(E e) {
        if (size==element.length){
            ensureCapa();
        }
        element[size++]=e;
    }
    public E get(int i){
        if (i>=size || i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return  (E) element[i];
    }

    public Object[] getElement() {
        return element;
    }
}
