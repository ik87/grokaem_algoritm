package graph.breadth_first_search;

import java.util.*;
import java.util.function.Predicate;

/**
 *
 * @author Kosolapov Ilya (d_dexter@mail.ru)
 */
public class BFS {
    public static <T> T bfs(HashMap<T, List<T>> graph, T start, Predicate<T> predicate) {
        T result = null;
        Deque<T> deque = new LinkedList<>();
        Set<T> searched = new HashSet<>();
        deque.offer(start);
        do {
            T current = deque.poll();

            if (!searched.contains(current)) {
                if (predicate.test(current)) {
                    result = current;
                    break;
                }
                searched.add(current);
                for (T element : graph.get(current)) {
                    deque.offer(element);
                }
            }
        } while (!deque.isEmpty());
        return result;
    }


}
