
public class Main {

    public static void main(String[] args) {

        LinkedStack<Integer> a = new LinkedStack<>();

        a.push(5);
        a.push(67);
        a.push(34);
        a.push(90);

        a.print();
        System.out.print("\n" + a.pop() + "\n");
        a.print();
        System.out.print("\n" + a.peek() + "\n");
        a.print();

        System.out.print("\n======\n");

        ArrayStack<Integer> a1 = new ArrayStack<>();
        a1.push(12);
        a1.push(23);
        a1.push(98);
        a1.push(76);
        a1.print();
        System.out.print("\n" + a1.pop() + "\n");
        a1.print();
        System.out.print("\n" + a1.peek() + "\n");
        a1.print();

    }
}
