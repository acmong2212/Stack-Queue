package stack_anh_toan_bao_lam;

import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();

        myStack.add(1);
        myStack.add(3);
        myStack.add(5);

        myStack.show();
    }
}
