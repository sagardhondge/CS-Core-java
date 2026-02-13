package collection.list;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack s1= new Stack();
        s1.push(100);s1.push(200);
        System.out.println(s1);
        s1.push(null); s1.push('x'); s1.push(100);
        System.out.println(s1);
    }
}
