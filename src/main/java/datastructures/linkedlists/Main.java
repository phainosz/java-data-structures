package datastructures.linkedlists;

public class Main {

    public static void main(String[] args) {
        removeLastExample();
        prependExample();
        removeFirstExample();
        getExample();
        setExample();
        insertExample();
        removeExample();
        reverseExample();
    }

    private static void reverseExample() {
        System.out.println("-----------------------");
        System.out.println("Reverse example");
        LinkedList linkedList = new LinkedList(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);

        linkedList.reverse();
        linkedList.printList();
    }

    private static void removeExample() {
        System.out.println("-----------------------");
        System.out.println("Remove example");
        LinkedList linkedList = new LinkedList(2);
        linkedList.append(3);
        linkedList.append(4);

        linkedList.remove(1);

        //2 items - returns 2 => 4
        linkedList.printList();
    }

    private static void insertExample() {
        System.out.println("-----------------------");
        System.out.println("Insert example");
        LinkedList linkedList = new LinkedList(2);
        linkedList.append(3);
        linkedList.append(4);

        linkedList.insert(3, 1);

        linkedList.printList();
    }

    private static void setExample() {
        System.out.println("-----------------------");
        System.out.println("Set example");
        LinkedList linkedList = new LinkedList(2);
        linkedList.append(3);

        linkedList.set(0, 10);
        linkedList.set(11, 10);//return false

        linkedList.printList();
    }

    private static void getExample() {
        System.out.println("-----------------------");
        System.out.println("Get example");
        LinkedList linkedList = new LinkedList(2);
        linkedList.append(3);

        System.out.println(linkedList.get(0).value);

        linkedList.printList();
    }

    private static void removeFirstExample() {
        System.out.println("-----------------------");
        System.out.println("Remove first example");
        LinkedList linkedList = new LinkedList(2);
        linkedList.append(3);

        // 2 item - returns 2
        System.out.println(linkedList.removeFirst().value);
        // 1 item - returns 3
        System.out.println(linkedList.removeFirst().value);
        // 0 item - returns null
        System.out.println(linkedList.removeFirst());
    }

    private static void prependExample() {
        System.out.println("-----------------------");
        System.out.println("Prepend example");
        LinkedList linkedList = new LinkedList(2);
        linkedList.append(3);

        //2 => 3 =>
        linkedList.printList();

        linkedList.prepend(1);

        //1 => 2 => 3 =>
        linkedList.printList();
    }

    private static void removeLastExample() {
        System.out.println("-----------------------");
        System.out.println("Remove last example");
        LinkedList linkedList = new LinkedList(2);
        linkedList.append(3);

        // 2 items - return 3
        System.out.println(linkedList.removeLast().value);
        // 1 item - return 2
        System.out.println(linkedList.removeLast().value);
        //0 items - return null
        System.out.println(linkedList.removeLast());
    }
}
