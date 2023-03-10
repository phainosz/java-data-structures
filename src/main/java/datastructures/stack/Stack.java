package datastructures.stack;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        Node node = new Node(value);
        top = node;
        height = 1;
    }

    public Node pop() {
        if(height == 0) return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

    public void push(int value) {
        Node node = new Node(value);
        if (height != 0) {
            node.next = top;
        }
        top = node;

        height++;
    }

    public void printStack() {
        System.out.println("===========printStack===========");
        Node temp = top;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("================================");
    }
}
