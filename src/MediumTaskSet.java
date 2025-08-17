import java.util.*;

public class MediumTaskSet {
    public static void main(String[] args) {
        //Даны три множества: Set<String> set1, set2, set3.
        //Напишите метод, который возвращает множество, содержащее элементы, которые есть во всех трёх множествах.






//        Set<Integer> set_1 = new TreeSet<>();
//        Set<Integer> set_2 = new TreeSet<>();
//        Set<Integer> set_3 = new TreeSet<>();
//        int randomNun;
//
//        for (int j = 0; j < 15; j++) {
//            randomNun = (int) (Math.random() * 15);
//            set_1.add(randomNun);
//        }
//        for (int j = 0; j < 15; j++) {
//            randomNun = (int) (Math.random() * 15);
//            set_2.add(randomNun);
//        }
//        for (int j = 0; j < 15; j++) {
//            randomNun = (int) (Math.random() * 15);
//            set_3.add(randomNun);
//        }
//        System.out.println("1: " + set_1);
//        System.out.println("2: " + set_2);
//        System.out.println("3: " + set_3);
//        Map<Integer, Integer> map_1 = new TreeMap<>();
//        Iterator<Integer> iterator_1 = set_1.iterator();
//        Iterator<Integer> iterator_2 = set_2.iterator();
//        Iterator<Integer> iterator_3 = set_3.iterator();
//        boolean first = true;
//        while (iterator_1.hasNext()) {
//
//            map_1.put(iterator_1.next(), 0);
//            for (Integer integer : map_1.keySet()) {
//                iterator_1.
//                if (Objects.equals(integer, iterator_1.next())) {
//
//                    map_1.put(integer, map_1.get(integer) + 1);
//                }
//            }
//
//        }
//
//        while (iterator_2.hasNext()) {
//
//
//            map_1.put(iterator_2.next(), 0);
//            for (Integer integer : map_1.keySet()) {
//                if (Objects.equals(integer, iterator_2.next())) {
//
//                    map_1.put(integer, map_1.get(integer) + 1);
//                }
//            }
//
//
//        }
//        while (iterator_3.hasNext()) {
//
//
//            map_1.put(iterator_3.next(), 0);
//            for (Integer integer : map_1.keySet()) {
//                if (Objects.equals(integer, iterator_3.next())) {
//
//                    map_1.put(integer, map_1.get(integer) + 1);
//                }
//            }
//
//
//        }
//        Set<Integer> set_final = new TreeSet<>();
//        for (Integer integer : map_1.keySet()) {
//            if (map_1.get(integer) >= 3) {
//                set_final.add(integer);
//            }
//        }
//
//        System.out.println("final: " + set_final);


        //все это сложный спагетти код,есть метод,который может сделать это гараздо легче
        Set<Integer> set_1 = new TreeSet<>();
        Set<Integer> set_2 = new TreeSet<>();
        Set<Integer> set_3 = new TreeSet<>();
        for(int i = 1; i <= 15; i++) {
            set_1.add((int) (Math.random() * 15));
            set_2.add((int) (Math.random() * 15));
            set_3.add((int) (Math.random() * 15));
        }
        System.out.println(set_1);
        System.out.println(set_2);
        System.out.println(set_3);
        Set<Integer> set_4 = new TreeSet<>(set_1);//тут крч в конструктор передаётся объект сет и просто
        // по факту создаётся такой же сет на основе переданного
        set_4.retainAll(set_2);
        set_4.retainAll(set_3);//этот метод работает так:он оставляет только те составляющие коллекции,
        // которые есть как в переданной, так и в текущей
        System.out.println("final: " + set_4);

        //если идти через map, то можно использовать во-первых HashMap, т.к. там можно null-значение и использовать getOrDefault
        //возвращает значение по ключу, если же собственно такой ключ не найден, возвращается параметр, указанный как defaultValue
//        key: Ключ, значение которого нужно получить.
//        defaultValue: Значение, которое будет возвращено, если ключ не найден.
    }
}
