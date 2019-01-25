
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        //declaring and initialising two wordGroups for each sentence
        WordGroup first = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup second = new WordGroup("When you play play hard when you work dont play at all");

        //return the array of words for each sentence
        String[] firstArray = first.getWordArray();
        String[] secondArray = second.getWordArray();

        //loop through the array of the first sentence
        for (String wordArrayOne : firstArray)
        {
            System.out.println(wordArrayOne); //output each word on a new line
        }

        System.out.println();

        //repeating the above for the second sentence
        for (String wordArrayTwo : secondArray)
        {
            System.out.println(wordArrayTwo);
        }

        HashSet<String> completeWordSet = first.getWordSet(second);

        for (String loop : completeWordSet) {
            System.out.println(loop);
        }
        System.out.println();

        HashMap<String, Integer> firstHashMap = first.getWordCounts(); //get word counts from first wordGroup
        HashMap<String, Integer> secondHashMap = second.getWordCounts(); //get word counts from second wordGroup

        /* Retrieving set of words (keys) with a loop for both sets, printing out the
        words and its count
        */
        for (String firstWords : firstHashMap.keySet())
        {
            System.out.println(firstWords + ": " + firstHashMap.get(firstWords));
        }

        System.out.println();

        for (String secondWords : secondHashMap.keySet())
        {
            System.out.println(secondWords + ": " + secondHashMap.get(secondWords));
        }

        System.out.println();

        /*Loop over the hashset of the complete lists of all the words with the
        word count from both hashmaps*/
        for (String finalWords : completeWordSet)
        {
            int sum = firstHashMap.getOrDefault(finalWords, 0) + secondHashMap.getOrDefault(finalWords, 0);
            System.out.println(finalWords + ": " + sum);
        }
    }
}
