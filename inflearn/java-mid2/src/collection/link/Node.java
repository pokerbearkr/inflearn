package collection.link;

import java.util.StringJoiner;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item=item;
    }
/*
    // IDE 생성 toString
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }*/

    //[A->B->C]
    @Override
    public String toString() {
        final String delimiter = "->";
        StringJoiner sj = new StringJoiner("->","[","]");
        Node x = this;

        while (x != null) {
            sj.add(x.item.toString());
            x=x.next;
        }
        return sj.toString();
    }
}
