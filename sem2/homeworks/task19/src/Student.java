import java.util.Comparator;

public class Student implements Comparable<Student> {

    private String fio;
    private int year;
    private String city;
    private int averageScore;

    public Student(String fio, int year, String city, int averageScore) {
        this.fio = fio;
        this.year = year;
        this.city = city;
        this.averageScore = averageScore;
    }

    public String getFio() {
        return fio;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public int compareTo(Student o) {
        return this.fio.compareTo(o.getFio());
    }

    @Override

    public String toString() {

        return fio + ", " + year + ", " + city + ", " + averageScore;

    }
}

class FioComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFio().compareTo(o2.getFio());
    }
}
