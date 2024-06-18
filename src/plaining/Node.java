package plaining;

import java.util.List;

public class Node {
    public  String type;
    public List<Node> children;

    @Override
    public String toString() {
        return "Node{" +
                "type='" + type + '\'' +
                ", children=" + children +
                '}';
    }
}
