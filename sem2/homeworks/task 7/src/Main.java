
public class Main {

    public static void main(String[] args) {
        ArrayCollection<Integer> a = new ArrayCollection<>();
        a.add(5);
        a.add(6);
        a.add(90);
        a.add(56);
        a.add(72);

        a.print();
        System.out.print("\n" + a.contains(5) + "\n");
        a.remove(72);
        a.print();

    }
}
