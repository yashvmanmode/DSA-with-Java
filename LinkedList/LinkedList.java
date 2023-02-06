public class LinkedList {

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

    public void addFirstLL(int Data){
        // Step1 Create a newNode
        Node newNode = new Node(Data);

        if (head == null){
            head = tail = newNode;
            size++;
            return;
        }

        // Step2 newNode's next = head
        newNode.next = head; 
        size++;

        // step3 head = newNode
        head = newNode;
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

    public void addMiddle(int idx, int Data) {
        
        if (idx == 0){
            addFirstLL(Data);
            return;
        }
        Node newNode = new Node(Data);
        Node temp = head;
        int i=0;

        while (i<idx-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        size++;
        temp.next = newNode;
    }

    public int removeFirst() {

        if (size == 0){
            System.out.println("LL is empty");
        }

        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
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
        LinkedList ll = new LinkedList();
        ll.addLastLL(1);
        ll.addLastLL(2);
        ll.addLastLL(3);
        ll.addLastLL(4);
        ll.addLastLL(5);
        ll.addLastLL(6);

        ll.printLL();

        ll.addMiddle(3, 8);
        ll.printLL();
        ll.removeFirst();
        ll.printLL();
        System.out.println(size);
        ll.removeFirst();
        System.out.println(size);
    }
}
