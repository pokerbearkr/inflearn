package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {

        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");
        System.out.println(first);

        printAll(first);

        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        add(first, "D");
        System.out.println(first);

    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);

    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x=x.next;
        }
    }


    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x=x.next;
        }

        return x;
    }
}
