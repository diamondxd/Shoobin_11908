import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayQueue<Integer> a = new ArrayQueue<>();
        a.add(4);
        a.add(78);
        a.add(98);
        a.add(32);
        a.print();
        System.out.print("\n" + a.poll() + "\n");
        a.print();

        System.out.print("\n=============\n");

        LinkedQueue<Integer> a1 = new LinkedQueue<>();
        a1.add(3);
        a1.add(34);
        a1.add(69);
        a1.add(67);
        a1.print();
        System.out.print("\n" + a1.poll() + "\n");
        a1.print();
    }
}
