package ss10_DSA_danhsach.btap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];

    }

    public MyList(int capacity) {
        if (capacity < 0) {
            System.out.println("capacity phai lon hon 0");
//            throw new IllegalArgumentException("capacity: " + capacity);

        } else {
            elements = new Object[capacity];
        }


    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;

        }
    }

    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(2);
        }
        elements[size++] = element;
        return true;
    }

    public void addElement(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(4);
        }

        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("mindcapacity: " + minCapacity);
        }
    }

    public Object[] getValue() {
        return elements;
    }


}
