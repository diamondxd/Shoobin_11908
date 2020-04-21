public class Participant {

    private String sex;
    private String name;

    public Participant(String name, String sex) {

        this.name = name;
        this.sex = sex;

    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }


    @Override

    public String toString() {

        return name + " " + sex;

    }

}
