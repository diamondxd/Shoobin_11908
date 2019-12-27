import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        String s = "C:\\Users\\Администратор\\Documents\\NetBeansProjects\\JavaLessonsProject\\image.jpg";

        String regex = "(\\w+)\\.(jpg|png|bmp)\\b";

        Pattern pt = Pattern.compile(regex);

        Matcher matcher = pt.matcher(s);

        while (matcher.find()) {


            System.out.println(matcher.group(1));

            System.out.println(matcher.group(2));



        }







    }
}
