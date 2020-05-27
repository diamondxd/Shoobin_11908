import java.util.HashMap;
import java.util.Map;

/**
по крайней мере создали исходные данные.
5/15
*/

public class Foods {

    public static void favoriteFoods(Map map, double rating) {




    }

    public static void main(String[] args) {

        HashMap<String, Double> porter = new HashMap<>();
        HashMap<String, Double> erik = new HashMap<>();
        HashMap<String, Double> yael = new HashMap<>();
        HashMap<String, Double> ken = new HashMap<>();

        porter.put("pie", 5.0);
        porter.put("ice_cream", 5.0);
        porter.put("mushrooms", 0.0);
        erik.put("chicken strips", 4.3);
        erik.put("cranberry sauce", 4.2);
        yael.put("lettuce", 2.4);

        Map<String, HashMap<String, Double>> map = new HashMap<>();
        map.put("Porter", porter);
        map.put("Erik", erik);
        map.put("Yael", yael);
        map.put("Ken", ken);


        favoriteFoods(map, 4.3);


    }
}
