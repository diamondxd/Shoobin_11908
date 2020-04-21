import java.io.FileWriter;
import java.io.IOException;

/**
 * Студент Шубин Д.С
 * Группа 11-908
 * Высшая школа информационных технологий и систем
 * Казанский (Приволжский) федеральный университет
 *
 * Контрольная работа №1.
 *
 * Всего 10 заданий, каждое задание реализуется в виде отдельного метода.
 * Задачи могут использовать результаты предыдущей задачи.
 * Если решить задачу не удалось, но она используется в следующей, вводите данные вручную.
 * Контрольная на 10 баллов.
 *
 * Итого 6,5 баллов.
 */
public class CW {
    /**
     * Метод выводит содержимое массива в строку.
     */
    public static String arrayToString(int [] numbers) {
        String result = "";
        for (int i = 0; i < numbers.length; i++) {
            result += (i == 0 ? "[" : "") + numbers[i] + (i < numbers.length - 1 ? ", " : "]");
        }
        return result;
    }

    /**
     * 1.
     * Создать массив до заданного числа такой, что каждый элемент больше предыдущего на 7.
     * Первое значение случайное от 0 до 100.
     * Зачтено, массив не соответствует заданию.
     */
    public static int [] getSevensArray(int limit) {

        int [] a = new int [limit];

        a[0] = 0 + (int) (Math.random() * 100);

        for(int i = 1; i < limit; i++) {

            a[i] = a[i-1] + 7;

        }
        return a;

    }

    /**
     * 2.
     * Дан массив. Найти второй самый большой элемент.
     * Ответ не верный, см. пример. 0,5.
     */
    public static int getSecondLargest(int [] array) {
        int max1 = -2147483648;
        int max2 = -2147483648;
        array = new int[]{3, 2, 5, 4, 1, 0};

        for(int i = 0; i < array.length; i++) {

            if(array[i] > max1) {

                max1 = i;
            }
        }

        array[max1] = -2147483648;

        for(int i = 0; i < array.length; i++) {

            if(array[i] > max2) {

                max2 = i;
            }
        }

        return array[max2];
    }

    /**
     * 3.
     * Написать метод сравнивающий два числа с плавающей точкой с точностью до двух разрадов.
     * Зачтено.
     */
    public static boolean isDoubleEquals(double a, double b) {

        String c = String.format("%.2f", a);

        String d = String.format("%.2f", b);

         if (c.equals(d)) {

            return true;
         }

        return false;


    }

    /**
     * 4.
     * Проверить является ли число простым.
     * Число является простым является простым,
     * если оно больше 1 и при этом делится без остатка только на 1 и на себя.
     * Единица не простое число.
     * Зачтено.
     */
    public static boolean isPrime(int x) {

        boolean a = false;

        int k = 0;

        if(x == 1){

            return a;

        }
        else {

            for(int i = 1; i < (x + 1); i++ ) {

                if(x % i == 0) {

                    k++;
                }

            }

            if(k == 2){

                a = true;
            }

        }

        return a;

    }

    /**
     * 5.
     * Даны две строки: слово и разделитель, вывести строку содержащую количество вхождений слова, разделенноый разделителем.
     * Например, ("Word", "X", 3) => WordXWordXWord.
     * Зачтено.
     */
    public static String repeatSeparator(String word, String sep, int count) {

        String a = "";

        for(int i = 0; i < count; i++) {

            a = a + word;

            if (i != (count - 1)) {

                a += sep;
            }

        }

        return a;

    }

    /**
     * 6.
     * Сгенерировать текст классической английской песни "99 Bottles of Beer on the Wall":
     * "99 bottles of beer on the wall, 99 bottles of beer.
     * Take one down and pass it around, 98 bottles of beer on the wall.
     *
     * 98 bottles of beer on the wall, 98 bottles of beer.
     * Take one down and pass it around, 97 bottles of beer on the wall.
     *
     * ...
     *
     * 1 bottle of beer on the wall, 1 bottle of beer.
     * Take one down and pass it around, no more bottles of beer on the wall.
     *
     * No more bottles of beer on the wall, no more bottles of beer.
     * Go to the store and buy some more, 99 bottles of beer on the wall."
     *
     * Результат записать в файл.
     *
     * Зачтено. Нет проверки на последнюю бутылку.
     */
    public static void singSong() throws IOException {


        FileWriter fw = new FileWriter("BottleSong.txt");

        int btl = 99;

        while (btl != 0) {

            fw.write(btl + " bottles of beer on the wall, " + btl + " bottles of beer. \n");

            btl--;

            if (btl == 0) {

                fw.write("Take one down and pass it around, no more bottles of beer on the wall.\n\n");

            }

            else {

                fw.write("Take one down and pass it around, " + btl + " bottles of beer on the wall.\n\n");



            }
        }

        System.out.println();

        fw.write("No more bottles of beer on the wall, no more bottles of beer.\n");

        btl = 99;

        fw.write("Go to the store and buy some more, " + btl + " bottles of beer on the wall.");

        fw.close();

    }

    /**
     * 7.
     * Дана строка содержащая выходные данные книги и его ISBN.
     * Например, Блинов, И.Н., Романчик, В.С. Java. Методы программирования: уч.-мет. пособие / И.Н. Блинов, В.С. Романчик. — Минск: издательство «Четыре четверти», 2013. — 896 с. ISBN 978-985-7058-30-3.
     * Проверить ISBN на валидность и
     * получить строку вида "И.О. Фамилия: Название книги (ISBN валидный)".
     */
    public static String getBookName(String entry){
        return "";
    }

    /**
     * 8.
     * ISBN состоит из 13 цифр. Последняя цифра контрольная. Вычисляется по алгоритму EAN-13 следующим образом:
     * 1. вычисляется сумма цифр на четных позициях;
     * 2. полученная сумма умножается на три;
     * 3. вычисляется сумма цифр на нечетных местах;
     * 4. полученные числа в п.2 и п.3 складываем;
     * 5. отбрасываем десятки и отнимаем из 10, и получаем контрольную цифру.
     * Если последняя цифра числа из п.4 = 0, то контрольная цифра равна нулю.
     * @return boolean
     *
     * Зачтено.
     */
    public static boolean isISBNValid(String str){

        int sum = 0;

        String str1 = "";

        String number = "";

        number += str.charAt(str.length()-1);

        int lastNumber = Integer.parseInt(number);

        number = "";

        int checkNumber = 0;

        boolean a2 = false;

        for(int i = 0; i < str.length()-1; i++){

            if ((i + 1) % 2 == 0){

                number += str.charAt(i);

                sum = sum + Integer.parseInt(number) * 3;

                number = "";

            }

            else

                if ((i + 1) % 2 != 0){

                number += str.charAt(i);

                sum += Integer.parseInt(number);

                number = "";
            }
        }

        str1 = Integer.toString(sum);

        number += (str1.charAt(str1.length()-1));

        checkNumber = Integer.parseInt(number);

        number = "";

        if (checkNumber == 0 & lastNumber == 0){

            a2 = true;

        }

        else

            if(checkNumber != 0 & (10 - checkNumber) == lastNumber ){

            a2 = true;
        }

        return a2;
    }

    /**
     * 9.
     * Сделать частотный словарь букв заданной строки.
     * Например, "Abba" => "a: 2
     *                      b: 2",
     *           "java is awesome" => "a: 3
     *                                 e: 1
     *                                 i: 1
     *                                 j: 1
     *                                 m: 1
     *                                 o: 1
     *                                 s: 1
     *                                 v: 1
     *                                 w: 1".
     */
    public static String lettersFrequency(String str) {

        int k1 = 0;

        String strS = "";

        for(int i = 0; i < str.length() - 1; i++) {

            if(str.charAt(i) == '0') {

                continue;
            }

            for(int j = i; j < str.length(); j ++) {

                if(str.charAt(j) == 0) {

                    continue;
                }

                if(str.charAt(i) == str.charAt(j)) {

                    k1++;

//                    str.charAt(j) = 0;

                }


            }

//            StrS += (str.charAt(i) + ": " + (String) k1);

            k1 = 0;


        }
        return strS;
    }

    /**
     * Метод main() почти готов, нужно немного подредактировать.
     */
    public static void main(String[] args) throws IOException {
        int [] sevens;
        System.out.println("Массив \"семёрок\": " + arrayToString(sevens = getSevensArray(200)));
        System.out.printf("Вторым самым большим элементом является %d.%n", getSecondLargest(sevens));

        /* TODO:
            Проверить является ли каждый элемент массива sevens простым.
            Если является, записать в массив, затем вывести эти числа и их количество.
            Для вывода используйте готовый метод arrayToString.
         */
        int [] primes = new int[0];
        for (int value : sevens) {

        }

        primes = new int[]{2, 113, 115};
        for (int value : primes) {
            System.out.println(value + ": " + isPrime(value));
        }

        if (primes.length > 0) System.out.printf("Простые числа: %s : %d.%n", arrayToString(primes), primes.length);
        else System.out.println("В массиве нет простых чисел.");

        double a = 1.123;  // Math.random() * 100;
        double b = 1.1234; // Math.random() * 100;
        System.out.printf(isDoubleEquals(a, b) ? "Числа %f и %f равны, с точностью до эпсилон = 0,01.%n" : "Числа %f и %f не равны.%n", a, b);

        System.out.println("('Word', 'X', 3) => " + repeatSeparator("Word", "X", 3));

        singSong();
        /* TODO:
            Прочитайте из файла, полученного в предыдущем задании, текст и вычислите для него частотный словарь букв.
         */
        String song = "";
        System.out.printf("Частотный словарь букв: %n%s", lettersFrequency(song));

        /* TODO:
            Прочитайте файл 'references.txt', в нем содержится список литературы, на каждоый строке новая запись.
            В третьей строке ISBN с ошибкой.
         */
        String filename = "references.txt";
        String entry = "";
        System.out.printf("Список литературы:%n%s%n", getBookName(entry));


        // допустим здесь подаются очищенные ISBN.
        for (String str :
                new String[]{"9789857058303", "9785977507356", "9785977507355"}) {
            System.out.printf("%s - %s.%n", str, isISBNValid(str));
        }

        System.out.println(lettersFrequency("abba"));
    }
}
