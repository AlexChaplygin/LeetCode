package replace_words;

import java.util.List;

public class ReplaceWords {

    /*
    Input: dict = ["cat", "bat", "rat"]
sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"


 If a successor has many roots can form it, replace it with the root with the shortest length.
     */

    public String replaceWords(List<String> dict, String sentence) {
        String[] sentenceArray = sentence.split(" ");
        String[] resultArray = new String[sentenceArray.length];
        for (int i = 0; i < sentenceArray.length; i++) {
            for (int j = 0; j < dict.size(); j++) {
                if (sentenceArray[i].startsWith(dict.get(j))) {
                    if (resultArray[i] == null) {
                        resultArray[i] = dict.get(j);
                    } else if(resultArray[i].length() > dict.get(j).length() || sentenceArray[i].indexOf(dict.get(j)) < sentenceArray[i].indexOf(resultArray[i])){
                        resultArray[i] = dict.get(j);
                    }
                }
            }
            if (resultArray[i] == null) {
                resultArray[i] = sentenceArray[i];
            }
        }
        return String.join(" ", resultArray);
    }
}
