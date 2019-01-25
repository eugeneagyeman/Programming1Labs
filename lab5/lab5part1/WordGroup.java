import java.util.HashMap;
import java.util.HashSet;

public class WordGroup {

    public String words;

    public WordGroup(String input) {
        words = input.toLowerCase();
    }

    public String[] getWordArray() {
        String[] wordArray = words.split(" ");
        return wordArray;
    }

    public HashSet<String> getWordSet(WordGroup setofwords) {
        HashSet<String> wordSet = new HashSet<>();

        for(String x : this.getWordArray())
        {
            wordSet.add(x);
        }

        for(String y : setofwords.getWordArray())
        {
            wordSet.add(y);
        }

        return wordSet;
    }

    public HashMap<String,Integer> getWordCounts() {
        HashMap<String,Integer> wordCount = new HashMap<>();

        // Comments created by helper from programming help.
        for(String x : this.getWordArray())
        {
            if(wordCount.containsKey(x))   //If we’ve seen it before (containsKey)
            {
                int count = wordCount.get(x);
                count++;    //add 1 to its count (get)
                wordCount.put(x, count);    //set the count accordingly (put)
            }
            else
            {
                wordCount.put(x,1);    //Else set its count = 1 (put)
            }
        }
        return wordCount;

    }
}