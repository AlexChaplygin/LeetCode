package palindrome_number;

/*
Determine whether an integer is a palindrome. Do this without extra space.

click to show spoilers.

Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer.
However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow.
How would you handle such case?

There is a more generic way of solving this problem.
*/

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        String s = "";
        char[] charArray = ((Integer)x).toString().toCharArray();
        for(int i = charArray.length - 1; i >= 0; i--){
            if(charArray[i] != '-' && charArray[i] != ' ' && charArray[i] != '_')
                s += charArray[i];
        }

        return ((Integer)x).toString().equals(s);
    }

}
