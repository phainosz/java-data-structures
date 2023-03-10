package datastructures.doublylinkedlists;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public Node removeAt(int index) {
        if (index < 0 || index >= length) return null;

        if(index == 0) return removeFirst();

        if(index == length -1) return removeLast();

        Node temp = get(index);
        temp.next.previous = temp.previous;
        temp.previous.next = temp.next;
        temp.next = null;
        temp.previous = null;

        length--;
        return temp;
    }

    public boolean insertAt(int index, int value) {
        if(index < 0 || index > length) return false;

        if(index == 0) {
            prepend(value);
            return true;
        }

        if(index == length) {
            append(value);
            return true;
        }

        Node node = new Node(value);
        Node before = get(index -1);
        Node after = before.next;
        node.previous = before;
        node.next = after;
        before.next = node;
        after.previous = node;
        length++;
        return true;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public Node get(int index) {
        if(index < 0 || index >= length) return null;

        Node temp = head;
        if(index < length/2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length -1; i > index; i--) {
                temp = temp.previous;
            }
        }


        return temp;
    }

    public Node removeFirst() {
        if(length == 0) return null;

        Node temp = head;
        if(length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.previous = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if(length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.previous = node;
            head = node;
        }

        length++;
    }

    public void append(int value) {
        Node node = new Node(value);
        if(length == 0) {
            head = node;
        } else {
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        length++;
    }

    public Node removeLast() {
        if(length == 0) return null;

        Node temp = tail;

        if(length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
            temp.previous = null;
        }
        length--;

        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " => ");
            temp = temp.next;
        }
        System.out.println();
    }
}
