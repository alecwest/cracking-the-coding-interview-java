package treesandgraphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class RouteBetweenNodesTest {
    @Test
    public void routeBetweenNodes() {
        Graph<Integer> graph = new Graph<>();
        graph.nodes.add(new Node<Integer>(1));
        graph.nodes.add(new Node<Integer>(2));
        graph.nodes.get(0).children.add(graph.nodes.get(1));
        graph.nodes.add(new Node<Integer>(3));
        graph.nodes.get(1).children.add(graph.nodes.get(2));
        graph.nodes.get(2).children.add(graph.nodes.get(0));
        graph.nodes.add(new Node<Integer>(4));
        graph.nodes.add(new Node<Integer>(5));
        graph.nodes.get(3).children.add(graph.nodes.get(4));
        graph.nodes.add(new Node<Integer>(6));
        graph.nodes.get(4).children.add(graph.nodes.get(5));

        assertFalse(RouteBetweenNodes.routeBetweenNodes(graph.nodes.get(0), graph.nodes.get(5)));
    }

    @Test
    public void routeBetweenNodesNotConnected() {
        Graph<Integer> graph = new Graph<>();
        graph.nodes.add(new Node<Integer>(1));
        graph.nodes.add(new Node<Integer>(2));
        graph.nodes.get(0).children.add(graph.nodes.get(1));
        graph.nodes.add(new Node<Integer>(3));
        graph.nodes.get(1).children.add(graph.nodes.get(2));
        graph.nodes.add(new Node<Integer>(4));
        graph.nodes.get(0).children.add(graph.nodes.get(3));
        graph.nodes.get(1).children.add(graph.nodes.get(3));
        graph.nodes.get(2).children.add(graph.nodes.get(3));
        graph.nodes.add(new Node<Integer>(5));
        graph.nodes.get(2).children.add(graph.nodes.get(4));
        graph.nodes.add(new Node<Integer>(6));
        graph.nodes.get(3).children.add(graph.nodes.get(5));

        assertTrue(RouteBetweenNodes.routeBetweenNodes(graph.nodes.get(0), graph.nodes.get(5)));
    }
}