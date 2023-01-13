public class PlaceBinaryString {

    public static void Binary_String(int n, int lastPlace, String str) {

        if (n == 0){
            System.out.println(str);
            return;
        }

        Binary_String(n-1, 0, str+"0");
        if (lastPlace == 0)
            Binary_String(n-1, 1, str+"1");
        
    }

    public static void main(String[] args) {
        String sb = "";
        int n = 3;
        int lastPlace = 0;
        Binary_String(n, lastPlace, sb);
    }
}