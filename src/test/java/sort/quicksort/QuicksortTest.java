package sort.quicksort;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class QuicksortTest {
    @Test
    public void whenUnsortedThenSorted() {

        List<Integer> list = Arrays.asList(5, 6, 7, 1, 8, 2, 3, 4);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> result = Quicksort.quicksort(list);
        assertThat(expect, is(result));
        //System.out.println(Quicksort.count);
    }

}