public class searchInLL {

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

    public int search_LL(int key) {
        Node temp = head;
        int idx = 0;

        while (temp != null) {
            if (temp.data == key) {
                System.out.print("The key is in the position: ");
                return idx+1;
            }
            temp = temp.next;
            idx++;
        }

        return -1;
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
        searchInLL ll = new searchInLL();
        ll.addLastLL(1);
        ll.addLastLL(2);
        ll.addLastLL(3);
        ll.addLastLL(4);
        ll.addLastLL(5);
        ll.addLastLL(6);

        ll.printLL();
        System.out.println(ll.search_LL(3));
    }
}
