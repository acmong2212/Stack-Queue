package reverse_stack;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stackINT = new Stack<>();
        stackINT.push(1);
        stackINT.push(2);
        stackINT.push(3);
        System.out.print(stackINT.get(2) + "\t");
        System.out.print(stackINT.get(1)+ "\t") ;
        System.out.println(stackINT.get(0));
        System.out.println("Mang ban dau: " +stackINT);
        System.out.println();


        Stack<String> wStack = new Stack<>();
        String mWord = "One Two Three";
        String[] words = mWord.split("\\s");
        for (String w : words) {
            System.out.println(w);
        }
        wStack.push(mWord);
        System.out.println("Push mWord vao wStack: [" +mWord + "]");
    }
}
