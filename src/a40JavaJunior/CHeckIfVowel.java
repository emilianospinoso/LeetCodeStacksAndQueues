package a40JavaJunior;

public class CHeckIfVowel {
    public static void main(String[] args) {

        System.out.println(checkVowel("jhfgjhfgjh"));
    }

    static boolean checkVowel(String s) {
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                return true;
            }
        }
        return false;
    }
}
