import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


/* 1. Список смежности (Используется)
Граф хранится как map типа HashMap, ключ - вершина, значение - список вершин, к которым есть путь
тип данных HashMap

2. Матрица смежности.
Граф хранится как двумерный массив из 0 и 1, если на пересечении i и j стоит 1, значит из i есть путь в j

тип данных int[][] (массив может использовать другие примитивные типы данных, такие как byte, long...)

3. Матрица инцидентности.

хранится как двумерный массив
Каждому ребру i,j ставится в соответствующем столбце: 1 в строке вершины i и -1 в строке вершины y;
если связи между вершиной и ребром нет, то в соответствующую ячейку ставится 0

тип данных также int[][] ...

 */

public class DirectedGraph {

    private Map<Integer, List<Integer>> v;
    private int size;

    //Constructor 1

    public DirectedGraph() {

        v = new HashMap<>();
        checkRep();
    }

    // Constructor 2

    public DirectedGraph(int size) {

        v = new HashMap<>();
        this.size = size;
    }

    public void setV(Map<Integer, List<Integer>> v) {
        this.v = v;
    }

    public Map getV() {
        return v;
    }

    // Loads integer values into the graph

    public void loadInt() throws FileNotFoundException {

        /*

        v.put(1, Arrays.asList(new Integer[] {2,4}));
        v.put(2, Arrays.asList(new Integer[] {3,4}));
        v.put(3, Arrays.asList(new Integer[] {2}));
        v.put(4, Arrays.asList(new Integer[] {1,3}));

         */

        FileReader fr = new FileReader("tests.txt");
        Scanner sc = new Scanner(fr);

        int co = 1;
        while(sc.hasNextLine()) {
            List<Integer> l = new ArrayList<>();
            while (sc.hasNextLine()) {
                String s = sc.next();
                if (s.equals(";")) {

                    break;
                } else {
                    l.add(Integer.parseInt(s));
                }
            }
            v.put(co, l);
            co++;
        }

    }

    // returns List of vertices related to given vertex

    public List verts(int i) {
        return v.get(i);
    }

    // returns boolean Are 2 given vertices connected or not

    public boolean isPath(int i1, int i2) {
        return v.get(i1).contains(i2);
    }

    // Invariant

    private void checkRep() {

        assert(v.getClass().getName().equals("java.util.HashMap"));
    }




}
