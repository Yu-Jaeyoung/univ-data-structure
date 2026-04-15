package stackqueue.stack.linkedstack;

import stackqueue.common.StackInterface;

public class Main {
    public static void main(String[] args) {
        StackInterface<Integer> integerStack = new LinkedStack<>();
        integerStack.push(100);
        integerStack.push(200);
        integerStack.push(300);

        while (!integerStack.isEmpty()) {
            int value = integerStack.pop();
            System.out.println(value);
        }

        StackInterface<String> stringStack = new LinkedStack<>();
        stringStack.push("one");
        stringStack.push("two");
        stringStack.push("three");

        while (!stringStack.isEmpty()) {
            System.out.println(stringStack.pop());
        }
    }
}
