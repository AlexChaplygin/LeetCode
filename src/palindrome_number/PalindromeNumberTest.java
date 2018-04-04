package palindrome_number;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void isPalindromeTest() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        Assert.assertFalse(palindromeNumber.isPalindrome(-123));
        Assert.assertFalse(palindromeNumber.isPalindrome(-1221));
        Assert.assertTrue(palindromeNumber.isPalindrome(1221));
        Assert.assertFalse(palindromeNumber.isPalindrome(-12_21));
        Assert.assertTrue(palindromeNumber.isPalindrome(12_21));
    }

}
