import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        //крч заебло меня что нет инфы которая разжуёт мне всё от а до я,поэтмоу делаю как делается

        //вообще сет основывается на map(например как HashSet базируется на HashMap, так и соответственно LinkedHashSet на LinkedHashMap    )
        //крч сет в отличие от листа поддекрживает уникальные значения,т.е. если я введу дважды одно и тоже значение, то это будет одна значение
        //пример:
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1);
        System.out.println(list);

        //а теперь глянем сет
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        System.out.println(set);
        //тут мы видим уникальные значения,но выставляется ли они по ворастанию?
        set.add(55);
        set.add(44);
        set.add(222);
        set.add(6);
        System.out.println(set);
        //как мы видим - нет
        //т.к. это всё таки хэш-таблица, то тут она не поддерживает индексацию

        //но есть такая тема как три сет, это структура основанная на бинарном дереве
        Set<Integer> set_2= new TreeSet<Integer>();
        set_2.add(1);
        set_2.add(2);
        set_2.add(3);
        set_2.add(4);
        set_2.add(1);
        set_2.add(55);
        set_2.add(44);
        set_2.add(222);
        set_2.add(6);
        System.out.println(set_2);
        //как мы видим тут уже отсортированно




        //ещё из-за изначального интерфейса iterator есть методы кое-как позволяющие ориентироваться среди элементов
        Iterator<Integer> iterator = set.iterator();
        System.out.println("Вывод итератора:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
