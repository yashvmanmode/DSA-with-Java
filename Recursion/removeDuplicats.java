public class removeDuplicats{ 

    public static void remove_Duplicates(String str, int idx, StringBuilder sb, boolean maps[]) {

        //BASE 
        if (idx == str.length()){
            System.out.println(sb);
            return;
        }

        //Main Work
        char currChar = str.charAt(idx);
        if (maps[currChar - 'a'] == true) {
            //It is a duplicate char
            remove_Duplicates(str, idx+1, sb, maps);
        }
        else{
            maps[currChar - 'a'] = true;
            sb.append(currChar);
            remove_Duplicates(str, idx+1, sb, maps);
        }
    }
    ///////////////////////////////////////

    public static void main(String[] args) {
        String str = "apnacollege";
        int idx = 0;
        boolean maps[] = new boolean[26];

        StringBuilder sb = new StringBuilder();

        remove_Duplicates(str, idx, sb, maps);
    }
}