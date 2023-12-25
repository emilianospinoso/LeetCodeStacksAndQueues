package a16LengthLastWorld;

public class ReverseSol {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("Hello World"));
    }

    static int lengthOfLastWord(String s) {
        int tamRest = s.length()-1;
        int sum=0;
        while (tamRest > 0) {
            if (s.charAt(tamRest) == ' ') {
               tamRest--;
            }else{
                break;
            }
        }
        while (tamRest > 0) {
            if (s.charAt(tamRest) != ' ') {
                sum++;
                tamRest--;
            }else{
                break;
            }
        }
        return sum;
    }
}
