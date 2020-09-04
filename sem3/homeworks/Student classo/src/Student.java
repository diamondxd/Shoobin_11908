public class Student {
    private int age;
    private int year;
    private String name;

    public Student(int age, int year, String name) {
        this.year = year;
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name : " + name + " age : " + age + " year : " + year;
    }


}
