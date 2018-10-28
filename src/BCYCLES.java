import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class BCYCLES {

    static class Node{
        int id;
        LinkedList<Node> adjacents = new LinkedList<>();

        public Node (int id){
            this.id = id;
        }
    }

    static void construct (Node root, LinkedList<Integer> set1, LinkedList<Integer> set2){
        Iterator<Integer> it1 = set1.iterator();
        while(it1.hasNext()){
            root.adjacents.add(new Node(it1.next()));
            set1.remove();
            construct(root.adjacents.peekLast(), set2, set1);
        }
    }

    static void traverse (Node root){
        System.out.print (root.id + " ");
        for (Node node : root.adjacents){
            traverse(node);
        }
    }

    public static void main (String[] args){
        LinkedList<Integer> set1 = new LinkedList<>();
        LinkedList<Integer> set2 = new LinkedList<>();
        set1.add(2);
        set1.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Node root = new Node (1);
        construct(root, set1, set2);

        traverse(root);

    }

}
