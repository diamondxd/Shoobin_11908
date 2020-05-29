
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.*;

import static org.junit.Assert.*;

public class DirectedGraphTest  {

    // Тест правильности загрузки графа из текстового файла

    @Test
    public void loadInt() throws FileNotFoundException {

        DirectedGraph g1 = new DirectedGraph();
        g1.loadInt();
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(1, Arrays.asList(new Integer[] {2,4}));
        map.put(2, Arrays.asList(new Integer[] {3,4}));
        map.put(3, Arrays.asList(new Integer[] {2}));
        map.put(4, Arrays.asList(new Integer[] {1,3}));

        assertEquals(map, g1.getV());

    }

    // тест метода verts, который должен возвратить прилегающие вершине к данной

    @Test
    public void verts() throws FileNotFoundException {
        DirectedGraph g1 = new DirectedGraph();
        g1.loadInt();

        List<Integer> g2 = new ArrayList<>();
        g2.add(3);
        g2.add(4);

        assertEquals(g2, g1.verts(2));


    }

    // тест метода isPath, который должен вернуть есть ли ребро между двумя вершинами

    @Test
    public void isPath() throws FileNotFoundException {
        DirectedGraph g1 = new DirectedGraph();
        g1.loadInt();

        boolean g2 = false;
        assertEquals(g1.isPath(1,3), g2);

    }
}