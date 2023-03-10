package datastructures.stack;

public class Main {

    public static void main(String[] args) {
        pushExample();
        popExample();
    }

    private static void popExample() {
        System.out.println("--------------------------------");
        System.out.println("Pop example");

        Stack stack = new Stack(1);
        stack.push(2);
        stack.push(3);

        stack.pop();

        stack.printStack();
    }

    private static void pushExample() {
        System.out.println("--------------------------------");
        System.out.println("Push example");

        Stack stack = new Stack(0);

        stack.push(1);
        stack.push(2);

        stack.printStack();
    }


}
