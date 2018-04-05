package longest_common_prefix;

/*
Write a function to find the longest common prefix string amongst an array of strings.
*/

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length ==0)
            return "";

        String prefix = strs[0];

        for(int i = 0; i < strs.length; i++) {
            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }

        return prefix;
    }

}
