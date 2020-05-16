
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        // task 3
        /*
        ArrayList<String> a = new ArrayList<>();
        System.out.println(load(a, "text.txt"));
        System.out.println(capitalizePlurals(a));
        System.out.println(removePlurals(a));

         */

        // task 11

        /*
        long cur;
        long cur2;

        cur = System.currentTimeMillis();
        HashSet<String> b = new HashSet<>();
        load(b, "text2.txt");
        cur2 = System.currentTimeMillis();
        System.out.print("HashSet : " + (cur2 - cur) + "millies\n");

        cur = System.currentTimeMillis();
        TreeSet<String> c = new TreeSet<>();
        load(c, "text2.txt");
        cur2 = System.currentTimeMillis();
        System.out.print("TreeSet : " + (cur2 - cur) + "millies\n");

         */

        // task 20

        ArrayList<String> a1 = new ArrayList<>();
        load(a1, "text2.txt");
        top50(a1);


    }

    public static void top50(ArrayList<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < list.size(); i++) {
            if(map.containsKey(list.get(i))) {
                int ct = map.get(list.get(i));
                ct++;
                map.put(list.get(i), ct);
            }
            else {
                map.put(list.get(i), 1);
            }
        }
        //vls.get(vls.size() - i)

        ArrayList<Integer> vls = new ArrayList<>(map.values());
        Collections.sort(vls);
        ArrayList sortedvls = new ArrayList();

        for(int i = 1; i <= 50; i++) {
            sortedvls.add(vls.get(vls.size() - i));
        }

        for(int i = 0; i < sortedvls.size(); i++) {
            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                if(entry.getValue().equals(sortedvls.get(i))) {
                    String del = "||";
                    System.out.printf("%6s%3s%6d\n", entry.getKey(),del,entry.getValue());
                    break;
                }
            }
        }

    }

    public static List<String> load(ArrayList<String> list, String file) throws Exception {
        FileReader fr = new FileReader(file);
        Scanner sc = new Scanner(fr);

        sc.useDelimiter(", |\\. |\\r\\n|,|\\.| ");

        while(sc.hasNextLine()) {
            list.add(sc.next());
        }

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("")) {
                list.remove(list.get(i));
            }
        }

        return list;
    }

    public static Set<String> load(Set<String> list, String file) throws Exception {
        FileReader fr = new FileReader(file);
        Scanner sc = new Scanner(fr);

        sc.useDelimiter(", |\\. |\\r\\n|,|\\.| ");

        while(sc.hasNextLine()) {
            list.add(sc.next());
        }

        return list;
    }

    public static List<String> capitalizePlurals(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).charAt(list.get(i).length() - 1) == 's') {
                list.set(i, list.get(i).toUpperCase());
            }
        }
        return list;
    }

    public static List<String> removePlurals(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).toLowerCase().charAt(list.get(i).length() - 1) == 's') {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}
