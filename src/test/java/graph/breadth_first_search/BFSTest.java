package graph.breadth_first_search;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BFSTest {
    HashMap<String, List<String>> graph = new HashMap<String, List<String>>() {
        {
            put("you", Arrays.asList("alice", "bob", "claire"));
            put("bob", Arrays.asList("anuj", "peggy"));
            put("alice", Arrays.asList("peggy"));
            put("claire", Arrays.asList("thom", "jonny"));
            put("annuj", null);
            put("peggy", null);
            put("thom", null);
            put("johny", null);
        }
    };


    @Test
    public void whenSearchNameThenGetIt() {
        String result = BFS.bfs(graph, "you", (x) -> {
            System.out.print(x + " ");
            return "peggy".equals(x);
        });
        assertThat("peggy", is(result));
    }

}