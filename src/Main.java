import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();

        for (String a : args) {
            s.add(a);
        }

        System.out.println(s.size() + " distinct words: " + s);

        Set<String> uniques = new HashSet<>();
        Set<String> dups = new HashSet<>();

        for (String a : args) {
            if (!uniques.add(a)) {
                dups.add(a);
            }
        }

        uniques.removeAll(dups);

        System.out.println("Unique words: " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}
