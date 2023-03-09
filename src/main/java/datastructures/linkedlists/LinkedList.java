package datastructures.linkedlists;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    //add item to the end
    public void append(int value) {
        Node node = new Node(value);

        if (length == 0) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        length++;
    }

    //remove and return last item
    public Node removeLast() {
        if (length == 0) return null;

        Node pre = head;
        Node temp = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;

        //rule length = 1, after removing length becomes 0
        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    //add item in the start
    public void prepend(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;

        Node temp = head;
        head = head.next;
        temp.next = null;

        length--;

        if (length == 0) {
            tail = null;
        }

        return temp;
    }

    //get by index (length)
    public Node get(int index) {
        if (index < 0 || index >= length) return null;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //set new value by index using length
    public boolean set(int index, int value) {
        Node temp = get(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    //insert value at given index using length
    public boolean insert(int index, int value) {
        if(index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }
        Node node = new Node(value);
        Node temp = get(index - 1);
        node.next = temp.next;
        temp.next = node;
        length++;
        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index > length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = head.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " => ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
