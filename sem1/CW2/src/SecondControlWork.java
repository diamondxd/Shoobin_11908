import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Студент Шубин Д.С
 * Группа 11-908
 * Высшая школа информационных технологий и систем
 * Казанский (Приволжский) федеральный университет
 *
 * Контрольная работа №2.
 *
 */
public class SecondControlWork {

    public static void main(String[] args) throws IOException {

        String filename = "MOCK_DATA.csv";

        System.out.println("Удачи!");

        Users users = new Users(filename);

        //users.saveAs("test.txt");

        System.out.print(users.getColByName("Money"));






    }
}


/**
 * 1. Считать файл csv в массив, каждая строка (кроме первой) которого является объектом типа User (см. задание 2).
 * Реализовать методы load, save, saveAs.
 * Реализовать метод getUserById, получающий объект типа User, по id (id != номер строки).
 *
 */
class Users {
    String filename;
    User[] users;

    Users(String filename) throws FileNotFoundException , IOException {

        this.filename = filename;

        users = new User[300];

        this.load();



    }

    public String getColByName(String name) {

        name = name.toLowerCase();

        switch(name) {

            case "id" :
                return "1";


            case "first_name" :
                return "2";


            case "last_name" :
                return "3";


            case "email" :
                return "4";


            case "gender" :
                return "5";


            case "money" :
                return "6";


            case "job" :
                return "8";


            case "country" :
                return "7";


            case "sex" :
                return "5";



        }

        return "No";

    }



    public void save() throws IOException {

        FileWriter fw = new FileWriter(filename);
        fw.write("id;first_name;last_name;email;sex;money;country;job\n");

        for (int i = 0; i < 300; i++) {

            fw.write(users[i].toString() + "\n");

        }

        fw.close();
    }

    public User getUserById (int id) {

        return users[id - 1];

    }



    public void saveAs(String newFilename) throws IOException {

        FileWriter fw = new FileWriter(newFilename);
        fw.write("id;first_name;last_name;email;sex;money;country;job\n");

        for (int i = 0; i < 300; i++) {

            fw.write(users[i].toString() + "\n");

        }

        fw.close();
    }



        public void load() throws FileNotFoundException, IOException  {

            FileReader fr = new FileReader(filename);
            Scanner sc = new Scanner(fr);

            sc.nextLine();
            sc.useDelimiter(";|\\n");


            int i1 = 0;
            while (sc.hasNextLine()) {

                users[i1] = new User(
                        sc.nextInt(),
                        sc.next(),
                        sc.next(),
                        sc.next(),
                        sc.next().equals("male") ? Sex.male : Sex.female,
                        sc.next(),
                        sc.next(),
                        sc.next());

                i1++;

            }


            fr.close();





        }



//    load()
//    save()
//    saveAs(String newFilename)
//    getUserById(int id)
//    findUsersWithParam(String haystack, String needle) (см. задание 4.).
}

/**
 * 2. Создать класс юзер, с полями из CSV файла. Все геттеры/сеттеры + toString. Пол через Enum.
 * 3. В первой строке файла содержатся заголовки таблицы.
 * Создать метод, позволяющий получить номер столбца, по его названию, например, getColByName("name").
 * 4. Создать boolean метод, возвращающий true если пара название/номер столбца и значение соответствует введенным.
 * Используя его, создать метод в тестовом классе, который получит строки по названию опрделенной должности/стране,
 * и сохранит его в другой файл csv.
 */
class User {
    // id;first_name;last_name;email;gender;money;country;job
    // getters&setter
    // toString()

    protected int id;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String country;
    protected String job;
    protected String money;

    protected Sex sex;

    public User(int id, String firstName, String lastName, String email, Sex sex, String money, String country, String job) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.money = money;
        this.country = country;
        this.job = job;
        this.sex = sex;
    }
// getters&setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String toString() {
        return id + ";" + firstName + ";" + lastName + ";" + email + ";" + sex + ";" + money + ";" + country + ";" + job;
    }

}


enum Sex {
    male,
    female
}

/**
 * 5. Имплементировать класс User, от интерфейса Measurable.
 * Реализовать метод getMeasure().
 * Реализовать статичные и дефолтные методы в интерфейсе.
 * Добавить в main-е выполнение этих методов.
 */
interface Measurable {
    double getMeasure();

    static double getAverage(Measurable[] list) {
        return 0;
    }

    static double getMaximum(Measurable[] list) {
        return 0;
    }

    static double getMinimum(Measurable[] list) {
        return 0;
    }

    default boolean isGreaterThan(Measurable other){
        return false;
    }
}

