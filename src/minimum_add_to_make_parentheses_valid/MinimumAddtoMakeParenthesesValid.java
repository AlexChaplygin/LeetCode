package minimum_add_to_make_parentheses_valid;

public class MinimumAddtoMakeParenthesesValid {

    public int minAddToMakeValid(String S) {

        while (S.contains("()"))
            S = S.replaceAll("\\(\\)", "");

        return S.length();
    }
}
