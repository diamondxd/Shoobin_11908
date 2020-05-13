import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List l = new List();

        System.out.print("Enter digits : \n");
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            a.add(sc.nextInt());
        }

        for(int i = a.size() - 1; i >= 0; i--) {
            l.insert(a.get(i));
        }


        l.print();

        //task 12 method test >>

        //l.addSort(5);
        
        System.out.print("\n");
        l.print();

        //task 5 methods >>

        System.out.print(l.sum() + "\n");
        System.out.print(l.max() + "\n");
        System.out.print(l.isNegative() + "\n");

        //task 6 methods >>

        l.removeHead();
        l.print();

        l.removeLast();
        l.print();

        l.removeP();
        l.print();

        l.removeFE(7);
        l.print();

        l.removeAE(2);
        l.print();

        l.insertDigit(10, 5);
        l.print();



    }

}
