import java.io.FileWriter;
public class tests {

    public static void load() throws Exception {

        FileWriter fw = new FileWriter("tests.txt");

        for(int i = 1; i <= 50; i++) {
            for(int j = 1; j < 100; j++) {

                fw.write(Integer.toString((int)(Math.random() * 100 * i)));
                fw.write(",");

            }
            fw.write(Integer.toString((int)(Math.random() * 100 * i)));
            fw.write("\n");
        }

        fw.close();

    }
}
