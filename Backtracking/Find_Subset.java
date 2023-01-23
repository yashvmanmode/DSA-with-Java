public class Find_Subset {

    public static void findSubset(String str, String ans, int idx) {
        //Base case
        if (idx == str.length()){
            System.out.println(ans);
            return;
        }

        //if yes
        findSubset(str, ans+str.charAt(idx), idx+1);

        //if No
        findSubset(str, ans, idx+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        int idx = 0;
        findSubset(str, ans, idx);
    }
}
