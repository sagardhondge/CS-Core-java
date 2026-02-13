package collection.list;

import java.util.Stack;

public class Stack3 {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(100);
        System.out.println(s1.empty());
        s1.pop();
        System.out.println(s1.empty());
    }
}
