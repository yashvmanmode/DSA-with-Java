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

    public void addFirstLL(int Data){
        // Step1 Create a newNode
        Node newNode = new Node(Data);

        if (head == null){
            head = tail = newNode;
            return;
        }

        // Step2 newNode's next = head
        newNode.next = head; 

        // step3 head = newNode
        head = newNode;
    }

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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLastLL(1);
        ll.addLastLL(2);
        ll.addLastLL(3);
        ll.addLastLL(4);
        ll.addLastLL(5);
        ll.addLastLL(6);

        ll.printLL();

    }
}
