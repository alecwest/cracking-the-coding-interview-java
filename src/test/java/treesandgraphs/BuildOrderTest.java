package treesandgraphs;

import javafx.util.Pair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Set;

import static org.junit.Assert.*;

public class BuildOrderTest {

    @Test
    public void buildOrder() {
        String[] projects = {"a", "b", "c", "d", "e", "f"};
        Pair[] dependencies = new Pair[]{
                new Pair<>("a", "d"),
                new Pair<>("f", "b"),
                new Pair<>("b", "d"),
                new Pair<>("f", "a"),
                new Pair<>("d", "c")
        };
        String[] expected = {"e", "f", "a", "b", "d", "c"};
        assertArrayEquals(expected, BuildOrder.buildOrder(projects, dependencies));
    }

    @Test
    public void buildOrderCircularDependency() {
        String[] projects = {"a", "b", "c", "d", "e", "f"};
        Pair[] dependencies = new Pair[]{
                new Pair<>("a", "d"),
                new Pair<>("f", "b"),
                new Pair<>("b", "d"),
                new Pair<>("f", "a"),
                new Pair<>("d", "a")
        };
        assertArrayEquals(null, BuildOrder.buildOrder(projects, dependencies));
    }
}