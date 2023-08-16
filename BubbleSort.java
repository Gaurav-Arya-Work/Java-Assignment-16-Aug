import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        List<Integer> templist = Arrays.asList(1, 4, 5, 4, 1, 5, 5, 2, 1, 1);
        ArrayList<Integer> list = new ArrayList<>(templist);
        System.out.println(list);
        bubbleSort(list);
        System.out.println(list);

    }

    static void bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr.get(j - 1) > arr.get(j)) {
                    temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
    }
}