import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count_Occurence {
    public static void main(String[] args) {
        List<String> templist = Arrays.asList("hi", "hello", "bye", "hi", "hello", "hey");
        ArrayList<String> list = new ArrayList<String>(templist);
        count_occurence(list);
    }

    private static void count_occurence(ArrayList<String> list) {
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String str : list) {
            if (hm.containsKey(str)) {
                hm.put(str, hm.get(str) + 1);
            }
            else {
                hm.put(str, 1);
            }
        }

        // displaying the occurrence of elements in the arraylist
        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println(val.getKey() + " " + "occurs" + " " + val.getValue() + " times");
        }
    }
}
