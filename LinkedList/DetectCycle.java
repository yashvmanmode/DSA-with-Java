public class DetectCycle {

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

    public static void MakeCycle() {
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
        }


    }

    public static boolean DetectCycleinLL() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
        
    }

   
    
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next = head;        

        System.out.println(DetectCycleinLL());
        
    }
}
