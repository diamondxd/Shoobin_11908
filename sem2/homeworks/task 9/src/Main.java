import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        arrayList<Integer> a = new arrayList<>();
        a.add(7);
        a.add(9);
        a.add(34);
        a.add(98);
        a.print();
        System.out.print("\n" + a.get(3) + "\n");
        a.set(3,65);
        a.print();
        System.out.println();
        a.add(4,67);
        a.print();
        a.remove(3);
        System.out.println();
        a.print();
        System.out.print("\n" + a.lastIndexOf(9) + "\n");
        List<Integer> b = a.subList(1,2);


    }
}
