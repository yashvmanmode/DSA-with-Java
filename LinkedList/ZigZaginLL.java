public class ZigZaginLL {

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

        public void printLL() {

            Node temp = head;
            while (temp != null) {
    
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // ---------------------_LOGIC_---------------------

        public void zigZag() {
            // Get Mid 

            Node slow = head;
            Node fast = head.next;
    
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;

            // Reverse 2nd Half 
            Node Curr = mid.next;
            mid.next = null;
            Node Prev = null;
            Node Next;

            while (Curr != null) {
                Next = Curr.next;
                Curr.next = Prev;
                Prev = Curr;
                Curr = Next;
            }
            Node left = head;
            Node right = Prev;
            Node nextL, nextR;  // Two temp node

            // Merge Altervative Node

            while (left != null && right != null) {
                nextL = left.next;
                left.next = right;

                nextR = right.next;
                right.next = nextL;

                right = nextR;
                left = nextL;
            }
        }

        // -------------------------------------------------
    
    public static void main(String[] args) {
        ZigZaginLL ll = new ZigZaginLL();

        // Add in LL
        ll.addLastLL(1);
        ll.addLastLL(2);
        ll.addLastLL(3);
        ll.addLastLL(4);
        ll.addLastLL(5);
        ll.addLastLL(6);

        ll.printLL();
        ll.zigZag();
        ll.printLL();
    }
}
