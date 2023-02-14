import java.util.ArrayList;
import java.util.Arrays;

public class Implementation {

    static class Stack {
        static ArrayList<Integer> arrayStack = new ArrayList<>();

        public static boolean isEmpty() {
            return arrayStack.size() == 0;
        }

        // Push
        public static void push(int data) {
            arrayStack.add(data);
        }

        // Pop
        public static int pop() {
            int top = arrayStack.get(arrayStack.size()-1);
            arrayStack.remove(arrayStack.size()-1);
            return top;
        }

        // Peek
        public static int Peek() {
            return arrayStack.get(arrayStack.size()-1);        
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        while (!s.isEmpty()) {
            System.out.println("Peek Element is :" + s.Peek());
            s.pop();
        }        
    }
}
