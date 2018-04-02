package reverse_words_string_III;

import java.util.StringJoiner;

/*
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
*/

public class ReverseWordsStringIII {

    public String reverseWords(String s) {
        String[] splitArray = s.split(" ");

        StringJoiner sj = new StringJoiner(" ");

        String reversSubString;

        for(String str : splitArray) {
            reversSubString = "";

            char[] charArray = str.toCharArray();
            for(int i = charArray.length - 1; i >= 0; i--) {
                reversSubString += charArray[i];
            }

            sj.add(reversSubString);
        }

        return sj.toString();
    }

}
