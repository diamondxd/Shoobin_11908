import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


        ArrayList<Student> a = new ArrayList<>();

        a.add(new Student("Abed", 1997, "Kyoto", 50));
        a.add(new Student("Yarex", 1989, "Rome", 54));
        a.add(new Student("Natasha", 2000, "Moscow", 78));

        // Comparator class

        FioComparator f = new FioComparator();

        a.sort(f);

        for(Student s : a) {
            System.out.println(s);
        }
        System.out.println();

        //Comparator anonymous class

        a.sort(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        if(o1.getYear() > o2.getYear()) {
                            return -1;
                        }
                        else {
                            return 1;
                        }
                    }
                }
        );

        for(Student s : a) {
            System.out.println(s);
        }
        System.out.println();

        // Comparator lambda

        a.sort((Student o1, Student o2) -> o1.getAverageScore() > o2.getAverageScore() ? -1 : 1);

        for(Student s : a) {
            System.out.println(s);
        }

    }
}
