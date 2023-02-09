import java.util.LinkedList;

public class LLinCollectionFrame {

    public static void main(String[] args) {

        // Create LL: use Integer, Float, Boolean instead of int, float, and boolean
        LinkedList<Integer> ll = new LinkedList<>();

        // Add in LL
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(0);
        
        System.out.println(ll);
        // Remove in LL
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }


}
