import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MediumTaskMap {
    public static void main(String[] args) {
        //Напишите метод, который принимает Map<String, Integer> и возвращает новую Map, где ключи и значения поменяны местами.
        //Если есть дубликаты значений, сохранить последний встреченный ключ.
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 1);
        map.put("g",2);
        map.put("h", 3);
        map.put("i", 4);
        map.put("j", 5);

        System.out.println(map);

        Map<Integer,String> newMap = reverseMap( map);

        System.out.println(newMap);
    }


    public static <K,V>Map<V,K> reverseMap(Map<K,V> oldMap) {
        Map<V,K> reverseMap = new HashMap<>();
        for(Map.Entry<K,V> entry: oldMap.entrySet()) {
            reverseMap.put(entry.getValue(), entry.getKey());
        }
        //крч я разобрался, нужно попять возвращаться в круги кодинга, так вот:
        //1. Мы пишем в начале своеобразные переменные, дженерики, Игнат почитай и вспомни что это и как
        //2. Сначала мы пишем переменные какие будут вообще использоваться, потом уже тип возвращаем переменной
        //3. Теперь пояснение, Map- ну тип структура содержащая общее, Map.Entry - один объект со свойставми возврата ключа и значения одним методом
        //map.entrySet() это создание набора объектов с аналогичными свойствами
        return  reverseMap;
    }
}
