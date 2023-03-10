package datastructures.queue;

public class Main {

    public static void main(String[] args) {
        enqueueExample();
        dequeueExample();
    }

    private static void dequeueExample() {
        System.out.println("--------------------------------");
        System.out.println("Enqueue example");
        Queue queue = new Queue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Value dequeued: " + queue.dequeue().value);

        queue.printQueue();
    }

    private static void enqueueExample() {
        System.out.println("--------------------------------");
        System.out.println("Dequeue example");

        Queue queue = new Queue(1);

        queue.enqueue(2);

        queue.printQueue();
    }
}
