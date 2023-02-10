import java.util.LinkedList;

public class MergeSort {

    public static class Node { 
        int data;
        Node next;

        public Node(int Data) {
            data = Data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLastLL(int Data) {
        Node newNode = new Node(Data);

        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    private Node merge(Node left, Node right) {
        Node mergeLL = new Node(-1);    // Dummy Node
        Node temp = mergeLL;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
                temp = temp.next;
            } else {
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }

        while (left != null) {
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }

        while (right != null) {
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;    // Mid Node
    }

    public Node mergeSort(Node head) {

        if (head == null || head.next == null){
            return head;
        }

        // find mid 
        Node mid = getMid(head);

        // Righthalf and Lefthalf: MergeSort
        Node rightHead = mid.next;
        mid.next = null;
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        // merge
        return merge(left, right);
    }

    public void printLL() {

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {

        MergeSort ll = new MergeSort();

        // Add in LL
        ll.addLastLL(5);
        ll.addLastLL(4);
        ll.addLastLL(3);
        ll.addLastLL(2);
        ll.addLastLL(1);

        ll.printLL();
        ll.head = ll.mergeSort(ll.head);
        ll.printLL();
        
    }
}
