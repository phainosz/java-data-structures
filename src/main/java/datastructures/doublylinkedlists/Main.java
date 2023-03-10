package datastructures.doublylinkedlists;

public class Main {

    public static void main(String[] args) {
        append();
        removeLast();
        prepend();
        removeFirst();
        get();
        set();
        insert();
        remove();
    }

    private static void remove() {
        System.out.println("-----------------------");
        System.out.println("Remove example");

        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);

        dll.removeAt(0);

        dll.printList();
    }

    private static void insert() {
        System.out.println("-----------------------");
        System.out.println("Insert example");

        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);

        dll.insertAt(3, 99);

        dll.printList();
    }

    private static void set() {
        System.out.println("-----------------------");
        System.out.println("Set example");

        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);

        dll.set(0, 99);

        dll.printList();
    }

    private static void get() {
        System.out.println("-----------------------");
        System.out.println("Get example");

        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);

        //return 3
        System.out.println("Get node by index: " + dll.get(3).value);
    }

    private static void removeFirst() {
        System.out.println("-----------------------");
        System.out.println("Remove first example");

        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);

        dll.removeFirst();

        //3 items -> returns 2 => 3 => 4 =>
        dll.printList();

    }

    private static void prepend() {
        System.out.println("-----------------------");
        System.out.println("Prepend example");

        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);

        dll.prepend(0);

        //4 items - returns 0 => 1 => 2 => 3 =>
        dll.printList();
    }

    private static void removeLast() {
        System.out.println("-----------------------");
        System.out.println("Remove last example");

        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);

        Node node = dll.removeLast();
        System.out.println("Item removed: " + node.value);

        //3 items -> return 1 => 2 => 3 =>
        dll.printList();
    }

    private static void append() {
        System.out.println("-----------------------");
        System.out.println("Append example");
        DoublyLinkedList dll = new DoublyLinkedList(1);

        dll.append(2);
        dll.append(3);

        dll.printList();
    }
}
