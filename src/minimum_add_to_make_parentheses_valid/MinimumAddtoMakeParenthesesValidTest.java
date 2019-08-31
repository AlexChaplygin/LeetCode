package minimum_add_to_make_parentheses_valid;

import org.junit.Assert;
import org.junit.Test;

public class MinimumAddtoMakeParenthesesValidTest {

    @Test
    public void minAddToMakeValid(){
        MinimumAddtoMakeParenthesesValid minimumAddtoMakeParenthesesValid = new MinimumAddtoMakeParenthesesValid();
        int res = minimumAddtoMakeParenthesesValid.minAddToMakeValid("()))((");
        Assert.assertEquals(4, res);
        res = minimumAddtoMakeParenthesesValid.minAddToMakeValid("((())");
        Assert.assertEquals(1, res);
    }
}
