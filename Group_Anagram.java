import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagram {
    public static void main(String[] args) {
        List<String> templist = Arrays.asList("hi", "hello", "hye", "ih", "elhlo", "hey");
        ArrayList<String> list = new ArrayList<String>(templist);
        groupAnagrams(list);
    }
    private static void groupAnagrams(ArrayList<String> arr)
    {
        HashMap<String, List<String> > map
                = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            String word = arr.get(i);
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            if (map.containsKey(newWord)) {

                map.get(newWord).add(word);
            }
            else {
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }

        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() > 1) {
                System.out.print(values);
            }
        }
    }
}
