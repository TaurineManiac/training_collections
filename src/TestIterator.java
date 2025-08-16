import java.util.*;

public class TestIterator {
    public static void main(String[] args) {
        Set<String> list = new TreeSet<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");


        Iterator<String> iter = list.iterator();
        int i = 0;
        while (iter.hasNext()) {
            System.out.println(i + ":" + iter.next());
            i++;
        }
        iter = list.iterator();
        System.out.println(iter.next());
        //т.е. чтобы он опять  пошёл итерировать его нужно опять прировнять к началу
        //я так понял это первым делом сделано для коллекций, к которым мы не можем обращаться по индексу
        
        //ну ещё он может напрямую удалять элементы из коллекции 
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        Iterator<Integer> iter2 = set.iterator();
        while (iter2.hasNext()) {
            if(iter2.next()<5){
                iter2.remove();
            }
        }
        System.out.println(set);
        //т.е. он напрямую влияет на объекты коллекции
    }
}
