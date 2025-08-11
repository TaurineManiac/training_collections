import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        Map<String,Integer> map2 = new Hashtable();
        map.put("Vova", 12);
        map2.put("Vovan", 12);
        map.put("Vika", 16);
        map.put("Vika",22);//с один и тем же именем рабоает последнее
        map2.put("Vikaka", 16);
        System.out.println(map);
        System.out.println(map2);


//        HashMap:
//
//        Не синхронизирована (не потокобезопасна).
//        Разрешает null в качестве ключа и значения.
//                Более современная и обычно быстрее, так как не тратит ресурсы на синхронизацию.
//
//
//        Hashtable:
//
//        Синхронизирована (потокобезопасна).
//                Не разрешает null ни для ключей, ни для значений.
//        Устаревшая реализация, реже используется в современном коде (обычно предпочитают ConcurrentHashMap для потокобезопасности).
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        for(String key : map2.keySet()){
            System.out.println(key + " : " + map2.get(key));
        }

    }
}
