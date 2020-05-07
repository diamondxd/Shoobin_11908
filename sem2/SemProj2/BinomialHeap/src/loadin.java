import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.FileReader;
import java.util.Scanner;

public class loadin {

    public static void load() throws Exception {

        FileReader fr = new FileReader("tests.txt");
        Scanner sc = new Scanner(fr);

        sc.useDelimiter(",|(\\n)");

        BinomialHeap bh = new BinomialHeap();

        int c = 1;
        long a;
        long b;

        while(sc.hasNextLine()) {

            if(c==51) {
                break;
            }


            for (int i = 0; i < 100; i++) {

                bh.insert(sc.nextInt());

            }

            System.out.println("#" + c);

            a = System.nanoTime();
            bh.insert(50);
            b = System.nanoTime();
            System.out.println("Insert(50) : " + (b - a) + " nanos");

            a = System.nanoTime();
            bh.delete(50);
            b = System.nanoTime();
            System.out.println("Delete(50) : " + (b - a) + " nanos");

            bh.makeEmpty();
            c++;

        }

    }
}
