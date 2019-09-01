package number_of_lines_to_write_string;

public class NumberofLinesToWriteString {

    public int[] numberOfLines(int[] widths, String S) {
        String alphStr = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        int lines = 1;

        for (int i = 0; i < S.length(); i++) {
            int index = alphStr.indexOf(S.charAt(i));
            if (count + widths[index] > 100) {
                count = widths[index];
                lines++;
            } else {
                count += widths[index];
            }
        }

        return new int[]{lines, count};
    }

}
