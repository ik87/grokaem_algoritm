package sort.quicksort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kosolapov Ilya (d_dexter@mail.ru)
 */
public class Quicksort {
    static Integer count = 0;

    public static List<Integer> quicksort(List<Integer> list) {

        if (list.size() < 2) {
            return list;
        }
        Integer pivotIndex = list.size() / 2;
        //Integer pivotIndex = 0;

        Integer pivot = list.get(pivotIndex);

        List<Integer> max = new ArrayList<>();
        List<Integer> min = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (pivotIndex == i) {
                continue;
            }
            if (list.get(i) <= pivot) {
                max.add(list.get(i));
            }
            if (list.get(i) > pivot) {
                min.add(list.get(i));
            }
        }
        count++;
        return new ArrayList<Integer>() {{
            addAll(quicksort(max));
            add(pivot);
            addAll(quicksort(min));
        }};


    }
}
