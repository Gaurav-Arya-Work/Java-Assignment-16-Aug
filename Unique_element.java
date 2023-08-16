import java.util.*;

public class Unique_element {
    public static void main(String[] args) {
        List<String> templist = Arrays.asList("hi", "hello", "bye", "hi", "hello", "hey");
        ArrayList<String> list = new ArrayList<String>(templist);
        unique_element(list);
    }

    private static void unique_element(ArrayList<String> list) {
        Set<String> set = new HashSet<>();
        for (String str : list) {
            set.add(str);
        }

        System.out.println("No. of unique element in the list = " + set.size());
    }
}
