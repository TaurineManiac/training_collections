import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UseMapAndList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        boolean first = true;
        list.add("Anna");
        list.add("Bob");
        list.add("Carl");
        list.add("Dan");
        list.add("Dan");
        for (String s : list) {

            if(!map.keySet().contains(s)){
                map.put(s, 1);
            }
            else {
                for(int i=0;i<list.size();i++) {

                    if(list.get(i).equals(s) && !first) {
                        map.put(s, map.get(s)+1);
                    }
                    else if(list.get(i).equals(s) && first) {
                        first = false;
                    }
                }
            }
        }
        System.out.println(list);
        System.out.println(map);
    }
}
