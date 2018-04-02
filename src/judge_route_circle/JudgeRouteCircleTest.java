package judge_route_circle;

import org.junit.Assert;
import org.junit.Test;

public class JudgeRouteCircleTest {

    @Test
    public void judgeCircleTest(){
        JudgeRouteCircle judgeRouteCircle = new JudgeRouteCircle();
        Assert.assertTrue(judgeRouteCircle.judgeCircle("UD"));
        Assert.assertFalse(judgeRouteCircle.judgeCircle("UL"));
        Assert.assertFalse(judgeRouteCircle.judgeCircle("RR"));
        Assert.assertTrue(judgeRouteCircle.judgeCircle("LUDR"));
    }
}
