public class Main {
    public static void main(String[] args) {
        BinarySearch tree = new BinarySearch();
        tree.insert(new Node(5));
        tree.insert(new Node(3));
        tree.insert(new Node(2));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));
        tree.insert(new Node(9));

        tree.remove(50);
        tree.display();

        System.out.println(tree.search(1));

        tree.remove(1);
    }
}
