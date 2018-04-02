package judge_route_circle;

/*
Initially, there is a Robot at position (0, 0).
Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character.
The valid robot moves are R (Right), L (Left), U (Up) and D (down).
The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
*/

public class JudgeRouteCircle {

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        char[] movesArray = moves.toCharArray();

        for(char c : movesArray) {
            if(Character.toUpperCase(c) == 'U') y++;
            if(Character.toUpperCase(c) == 'D') y--;
            if(Character.toUpperCase(c) == 'L') x--;
            if(Character.toUpperCase(c) == 'R') x++;
        }

        if(x == 0 && y == 0)
            return true;
        else
            return false;
    }
}
