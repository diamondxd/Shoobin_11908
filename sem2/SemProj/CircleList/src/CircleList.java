
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;



public class CircleList {

    private List l = new List();

    public CircleList(String filename) throws FileNotFoundException {

        FileReader fr = new FileReader(filename);
        Scanner sc = new Scanner(fr);

        sc.useDelimiter(";|\\r\\n");

        ArrayList<Participant> ar1 = new ArrayList<>();

        while (sc.hasNextLine()) {

            ar1.add(new Participant(sc.next(), sc.next()));

        }

        for(int i = ar1.size() - 1; i >=0; i--) {

            l.insert(new Participant(ar1.get(i).getName(), ar1.get(i).getSex()));

        }

        Element p = l.getHead();

        Element q = l.getHead();
        while (q != null && q.next != null) {
            q = q.next;

        }

        q.next = p;

    }


    private void show() {
        l.print();
    }

    private void insert(Participant p) {
        l.insert(p);
        Element p1 = l.getHead();
        Element q = l.getHead();

        for (int i = 0; i < l.size - 1; i++) {
            q = q.next;
        }

        q.next = p1;

    }

    private void delete(String name) {
        Element q = l.getHead();

        for (int i = 0; i < l.size - 1; i++) {
            q = q.next;
        }

        if (l.getHead().data.getName().equals(name)) {
            l.removeHead();
            q.next = l.getHead();
            l.size--;

            return;
        }

        q = l.getHead();

        for (int i = 0; i < l.size; i++) {

            if (q.next.data.getName().equals(name)) {
                q.next = q.next.next;
                l.size--;
                break;
            }

            q = q.next;

        }

    }

    private Participant last(int k) {
        Element q = l.getHead();

        while (l.size != 1) {
            for (int i = 0; i < k; i++) {
                q = q.next;
            }

            delete(q.data.getName());
            q = q.next;

        }

        return q.data;
    }

    private void sort(String name) {

        Element q = l.getHead();
        for (int i = 0; i < l.size; i++) {
            if(q.data.getName().equals(name)) {
            l.setHead(q);

            }

            q = q.next;
        }
    }

    private CircleList[] gender() throws FileNotFoundException {

        CircleList[] lar = new CircleList[2];

        CircleList female = new CircleList("test.txt");
        CircleList male = new CircleList("test.txt");

        int co = male.l.size;

        for(int i = 0; i < co; i++ ) {
            male.l.removeHead();
            male.l.size--;
            female.l.removeHead();
            female.l.size--;
        }

        Element q = l.getHead();

        for(int i = 0; i < l.size; i++){
            if(q.data.getSex().equals("female")) {
                female.insert(q.data);
            }
            else {
                male.insert(q.data);
            }

            q = q.next;
        }

        lar[0] = female;
        lar[1] = male;

        // gender method return test
        lar[0].show();
        lar[1].show();


        return lar;
    }


    public static void main(String[] args) throws FileNotFoundException, NullPointerException {

        CircleList l1 = new CircleList("test.txt");

        System.out.println("Circlelist: ");
        l1.show();
        System.out.println();

        l1.insert(new Participant("Vasya", "male"));

        System.out.println("Insert method: ");
        l1.show();
        System.out.println();

        l1.delete("Vasya");

        System.out.println("Delete method");
        l1.show();
        System.out.println();

        // last method test
        // l1.last(5).getName(); l1.show();

        System.out.println("Gender method lists");
        l1.gender();
        System.out.println();

        System.out.println("Cyclelist again");
        l1.show();
        System.out.println();

        l1.sort("Kaneki");

        System.out.println("Sort method ");
        l1.show();
        System.out.println();

    }

}