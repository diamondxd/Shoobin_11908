import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        List<Integer> list2 = Arrays.asList(1,3,5,7,9);

        intersect(list1, list2);

    }

    public static void intersect(List l1, List l2) {


        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < l2.size(); j++) {

                if((l1.get(i).equals(l2.get(j)))) {

                    System.out.print(l1.get(i) + " ");
                }

            }
        }

    }
}
