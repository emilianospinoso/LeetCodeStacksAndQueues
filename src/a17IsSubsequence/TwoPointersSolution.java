package a17IsSubsequence;

public class TwoPointersSolution {
    public static void main(String[] args) {
        String s = "ABCDE";
        String t = "ACE";

        System.out.println(isSubsequence(s, t));
    }

    static boolean isSubsequence(String s, String t) {
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
        }
        if (j == t.length()) {
            return true;
        }
        return false;
    }
}
