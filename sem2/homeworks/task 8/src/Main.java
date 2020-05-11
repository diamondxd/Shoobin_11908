public class Main {

    public static void main(String[] args) {
        LinkedCollection<Integer> a = new LinkedCollection<>();
        a.add(7);
        a.add(9);
        a.add(34);
        System.out.print(a.contains(34) + "\n");
        a.add(98);
        a.remove(34);
        System.out.print(a.size());
        a.print();
    }
}
