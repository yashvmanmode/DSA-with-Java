public class findAndRemove {

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
    public static int size;

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

    public void printLL() {

        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void findAndRemoveFromEnd(int n) {
        Node temp = head;
        int Size = 0;

        while (temp != null) {
            temp = temp.next;
            Size++;
        }

        if (n == Size) {
            head = head.next;
            return;
        }

        int idx = 1;
        int finalIdx = Size-n;
        Node prev = head;

        while (idx < finalIdx) {
            prev = prev.next;
            idx++;
        }

        prev.next = prev.next.next;
        return;
    }

    
    public static void main(String[] args) {
        findAndRemove ll = new findAndRemove();
        ll.addLastLL(1);
        ll.addLastLL(2);
        ll.addLastLL(3);
        ll.addLastLL(4);
        ll.addLastLL(5);

        ll.printLL();
        ll.findAndRemoveFromEnd(3);
        ll.printLL();

    }
}
