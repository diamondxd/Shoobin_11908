import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("gfnbvn");
        list.add("fdgfdg");
        list.add("dfhfdhfdh");
        list.add("ghgfh");

        System.out.print(addStars(list) + "\n");
        System.out.print(removeStars(list));

    }

    public static ArrayList<String> addStars(ArrayList<String> l) {

        ArrayList<String> list2 = new ArrayList<>();

        for(int i = 0; i < l.size(); i++) {
            list2.add(l.get(i));
        }
        l.clear();
        for(int i = 0; i < list2.size(); i++) {
            l.add(list2.get(i));
            l.add("*");
        }

        return l;
    }

    public static ArrayList<String> removeStars(ArrayList<String> l) {

        int c = 0;

        for(int i = 1; i < l.size(); i = i+2) {
            if(l.get(i).equals("*")) {
                c++;
            }
        }

        if(c == l.size()/2) {
            for(int i = 0; i < l.size(); i++) {
                if(l.get(i).equals("*")) {
                    l.remove(i);
                }
            }
        }
        else {
            System.out.print("Not appropriate");
        }

        return l;

    }
}

