public class RecursiveSearch {

    public static class Node { 
        int data;
        Node next;

        public Node(int Data) {
            data = Data;
            this.next = null;
        }
       
    }

    public void addLastLL(int Data) {
        Node newNode = new Node(Data);

        if (head == null){
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        size++;
        tail = newNode;
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void printLL() {

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public int helper(Node head, int key){
        if (head == null)
            return -1;

        if (head.data == key)
            return 0;

        int idx = helper(head.next, key);
        if (idx == -1)
            return -1;

        return idx+1;
    }

    public int resurSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        RecursiveSearch ll = new RecursiveSearch();
        ll.addLastLL(1);
        ll.addLastLL(2);
        ll.addLastLL(3);
        ll.addLastLL(4);
        ll.addLastLL(5);
        ll.addLastLL(6);

        ll.printLL();
        System.out.println(ll.resurSearch(3));
    }
}
