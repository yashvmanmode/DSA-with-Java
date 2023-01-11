public class CheckPalindrome {

    public static boolean check_Palindrome(String str) {
        for (int i=0; i<str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "lihwbvfihqwebrfi";

        if (check_Palindrome(str))
            System.out.println("String is a valid Palindrome");
        else
            System.out.println("String is not a valid palindrome ");
    }
}
