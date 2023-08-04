import java.util.*;
// TC O(n)
public class Duplicate_parenthesis {

    public static boolean duplicateParenthesis(String str) {

        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            // Closing condition
            if (ch == ')') {
                int count = 0; 
                while(s.pop() != '(') {
                    count++;
                }
                if(count < 1)
                    return true; // Duplicate exist 
            }
            else{
               s.push(ch);
            }
        }

        return false;

    }


    public static void main(String[] args) {
        String str = "((a+b))";
        String str2 = "(a+b)";
        System.out.println(duplicateParenthesis(str2));

    }
    
}
