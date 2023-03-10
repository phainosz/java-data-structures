package datastructures.trees;

public class Main {

    public static void main(String[] args) {
        insertExample();
        containsExample();
    }

    private static void containsExample() {
        System.out.println("--------------------------------");
        System.out.println("Contains example");

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(82);
        bst.insert(27);
        bst.insert(52);

        //should return true for any value inserted above
        System.out.println(bst.contains(52));
    }

    private static void insertExample() {
        System.out.println("--------------------------------");
        System.out.println("Insert example");

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(82);
        bst.insert(27);

        //should return 27
        System.out.println(bst.root.left.right.value);
    }


}
