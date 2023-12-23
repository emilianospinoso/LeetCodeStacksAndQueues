package a11GoatLatinANDdIvIsIoNsTrInG;

public class SolutionLenguageNew {
        public static void main(String[] args) {
            String sentence1 = "I speak Goat Latin";
            String result1 = toGoatLatin(sentence1);
            System.out.println(result1);

            String sentence2 = "The quick brown fox jumped over the lazy dog";
            String result2 = toGoatLatin(sentence2);
            System.out.println(result2);
        }

        static String toGoatLatin(String sentence) {
            String vowels = "aeiouAEIOU";
            String[] words = sentence.split(" ");
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                char firstChar = word.charAt(0);

                if (vowels.contains(String.valueOf(firstChar))) {
                    // Word starts with a vowel
                    result.append(word).append("ma");
                } else {
                    // Word starts with a consonant
                    result.append(word.substring(1)).append(firstChar).append("ma");
                }

                // Add 'a' based on the index
                for (int j = 0; j <= i; j++) {
                    result.append("a");
                }

                if (i < words.length - 1) {
                    result.append(" ");
                }
            }

            return result.toString();
        }
    }


/*
                You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.
        We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:
        If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
        For example, the word "apple" becomes "applema".
        If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
        For example, the word "goat" becomes "oatgma".
        Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
        For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
        Return the final sentence representing the conversion from sentence to Goat Latin.

        Example 1:

        Input: sentence = "I speak Goat Latin"
        Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
        Example 2:

        Input: sentence = "The quick brown fox jumped over the lazy dog"
        Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
                 */