public class CircularQueueB {

    static class Queue {
        static int arr[]; 
        static int size;
        static int rear;
        static int front;

        Queue(int n) {

            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
    
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear+1)%size == front;
        }

        public static void add(int data) {
            if (isFull()){
                System.out.println("Queue is full");
                return;
            }
            if (front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];

            //delete last element in queue
            if (rear == front)
                rear = front = -1;
            else
                front = (front+1)%size;

            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);


        System.out.println(q.isEmpty());

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println(q.isEmpty());

        System.out.println(q.remove());
        
        System.out.println(q.peek());
    }

    
}
