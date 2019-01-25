
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
        for (String x : firstArray)
        {
            System.out.println(x); //output each word on a new line
        }

        System.out.println();

        //repeating the above for the second sentence
        for (String y : secondArray)
        {
            System.out.println(y);
        }



        HashSet<String> firstHash = first.getWordSet(second);
        for (String loop : firstHash) {
            System.out.println(loop);
        }
        System.out.println();

        /*
        HashMap<String, Integer> firstHashMap = first.getWordCounts(); //get word counts from first wordGroup
        HashMap<String, Integer> secondHashMap = second.getWordCounts(); //get word counts from second wordGroup

        for (String x : firstHashMap.keySet())
        {
            System.out.println(x + ": " + firstHashMap.get(x));
        }

        System.out.println();

        for (String y : secondHashMap.keySet())
        {
            System.out.println(y + ": " + secondHashMap.get(y));
        }

        System.out.println();

        HashSet<String> completeWordSet = first.getwordset(second);
        System.out.println(completeWordSet);

        System.out.println();

        for (String y : completeWordSet)
        {
            int sum = firstHashMap.getOrDefault(y, 0) + secondHashMap.getOrDefault(y, 0);
            System.out.println(y + ": " + sum);
        }
        */
    }
}
