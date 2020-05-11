
public class Main {

    public static void main(String[] args) {

        linkedList<Integer> a = new linkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(30);
        a.set(2, 54);
        a.print();
        a.add(1,13);
        a.print();
        a.remove(1);
        a.print();
        System.out.print(a.indexOf(3) + "\n");
        a.add(3);
        a.print();
        System.out.print(a.lastIndexOf(3));



    }
}
