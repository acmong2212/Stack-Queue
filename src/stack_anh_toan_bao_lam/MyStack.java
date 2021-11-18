package stack_anh_toan_bao_lam;

import java.util.Arrays;

public class MyStack<E> {
    private int size;
    private E[] elements;

    public MyStack() {
        elements = (E[]) new Object[1];
    }


    public void add(E e) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size] = e;
        size++;
    }

    public void show() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    public E pop() {
        return null;
    }

    public E get(int i) {
        return null;
    }

    public boolean isEmpty() {
        return true;
    }
}
