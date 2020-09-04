import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        System.out.println("Name sort :");

        PriorityQueue<Student> pq1 = new PriorityQueue<>(new NameComp());
        load(pq1);
        print(pq1);
        System.out.println("Year sort :");
        PriorityQueue<Student> pq2 = new PriorityQueue<>(new YearComp());
        load(pq2);
        print(pq2);
        System.out.println("Age sort :");
        PriorityQueue<Student> pq3 = new PriorityQueue<>(new AgeComp());
        load(pq3);
        print(pq3);



    }

    public static PriorityQueue load(PriorityQueue<Student> pq) {
        pq.add(new Student(19, 2 , "Misha"));
        pq.add(new Student(18, 1 , "Naruto"));
        pq.add(new Student(20, 3 , "Ann"));
        pq.add(new Student(22, 4 , "Ori"));
        return pq;
    }

    public static void print(PriorityQueue<Student> pq) {
        while(pq.size() > 0) {
            System.out.println(pq.poll());
        }
    }
}

    class NameComp implements Comparator<Student> {

        public int compare(Student a, Student b) {
            return a.getName().compareTo(b.getName());
        }
    }
    class YearComp implements Comparator<Student> {

        public int compare(Student a, Student b) {
            if(a.getYear() > b.getYear()) {
                return 1;
            }
            if(a.getYear() == b.getYear()) {
                return 0;
            }
            if(a.getYear() < b.getYear()) {
                return -1;
            }
            return 0;
        }
    }
    class AgeComp implements Comparator<Student> {

        public int compare(Student a, Student b) {
            if(a.getAge() > b.getAge()) {
                return 1;
            }
            if(a.getAge() == b.getAge()) {
                return 0;
            }
            if(a.getAge() < b.getAge()) {
                return -1;
            }
            return 0;
        }
    }

