public class ReverseDLL {

    public class Node {
            
        int data;
        Node next; 
        Node prev;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
    
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverseDLL() {
        Node Curr = head;
        Node Prev = null;
        Node Next;

        while (Curr != null) {
            Next = Curr.next;
            Curr.next = Prev;
            Curr.prev = Next;

            Prev = Curr;
            Curr = Next;
        }
        head = Prev;
    }
    
    public static void main(String[] args) {
        ReverseDLL dll = new ReverseDLL();
    
        dll.addFirst(0);
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        dll.addFirst(6);
    
        dll.print();
        dll.reverseDLL();
        dll.print();
    }
}
