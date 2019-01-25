import java.util.HashMap;
import java.util.HashSet;

public class WordGroup {

    //instance variables
    public String words; //sentences stored in this String

    //Constructor to initialise and store a user's input in the variable 'words'
    public WordGroup(String input) {
        words = input.toLowerCase();    //convert the sentence into lower case first
    }

    /*
    method to create an array with each element being an individual word
    in the sentence
    */
    public String[] getWordArray() {
        //split the words if there is a space next to them and store them in the array
        String[] wordArray = words.split(" ");
        return wordArray;
    }

    /*
       method to return a HashSet of the set of words from this class and from
       another wordGroup object
    */
    public HashSet<String> getWordSet(WordGroup anotherWG)  //another wordGroup taken in as a parameter
    {
        //declaring and initialising a new HashSet
        HashSet<String> wordSet = new HashSet<>();

        //loop through the array of words from this class
        for (String wordOne : this.getWordArray()) {
            wordSet.add(wordOne); //add each word to the HashSet
        }

        //loop through the array from the other WordGroup object
        for (String wordTwo : anotherWG.getWordArray()) {
            wordSet.add(wordTwo); //add each word to the HashSet
        }
        return wordSet;    //return the hashset
    }

    /*
    Method to return the occurence of each word in a sentence
    */
    public HashMap<String, Integer> getWordCounts() {
        //declare and initialise a new HashMap for the word (key) and count (value)
        HashMap<String, Integer> wordCount = new HashMap<>();

        //loops through the array of a wordgroup object
        for (String wordKey : this.getWordArray()) {
            if (wordCount.containsKey(wordKey))   //If we’ve seen it before (containsKey)
            {
                int count = wordCount.get(wordKey);
                count++;    //add 1 to its count (get)
                wordCount.put(wordKey, count);    //set the count accordingly (put)
            } else {
                wordCount.put(wordKey, 1);    //Else set its count = 1 (put)
            }
        }
        return wordCount;
    }

}
