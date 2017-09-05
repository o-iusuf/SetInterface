import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> allWords = new TreeSet<>();

        //The TreeSet allWords will contain only one occurence of each word given as input
        for (String a : args) {
            s.add(a);
        }

        System.out.println(allWords.size() + " distinct words: " + allWords);

        Set<String> uniques = new HashSet<>();
        Set<String> dups = new HashSet<>();

        //For each word, try to add it to uniques; if it already exists, add it to dups
        for (String a : args) {
            if (!uniques.add(a)) {
                dups.add(a);
            }
        }

        //Remove all words from uniques which are also found in dups, thus retaining words with only one occurence
        uniques.removeAll(dups);

        System.out.println("Unique words: " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}
