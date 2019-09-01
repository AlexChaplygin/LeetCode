package number_of_lines_to_write_string;

import org.junit.Test;

public class NumberofLinesToWriteStringTest {

    @Test
    public void numberOfLinesTest() {
        NumberofLinesToWriteString numberofLinesToWriteString = new NumberofLinesToWriteString();
        numberofLinesToWriteString.numberOfLines(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, "abcdefghijklmnopqrstuvwxyz");
        numberofLinesToWriteString.numberOfLines(new int[]{4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, "bbbcccdddaaa");
    }
}
