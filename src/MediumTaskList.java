import com.sun.security.jgss.InquireType;

import java.util.*;

public class MediumTaskList {
    public static void main(String[] args) {
        //Дан List<Integer>. Напишите метод, который удаляет все дубликаты из списка, сохраняя порядок элементов.
        int randomChance;
        boolean flag = true;
        List<Integer> list = new LinkedList();
        for (int i = 1; i <= 10; i++) {
            randomChance = (int) (Math.random() * 3);
            if(randomChance == 1 && !flag) {
                list.add(i-1);
            }
            else{
                list.add(i);
                flag = false;
            }
        }

        System.out.println(list);
        int i =0;
        while(i< list.size()-1){
            if(list.get(i) == list.get(i+1)){
                list.remove(i+1);

            }
            i++;
        }
        System.out.println(list);


        //крч я узнал решение полегче
        Set<Integer> set = new LinkedHashSet();
        set.addAll(list);
        System.out.println(set);
        //лол это намного удобнее, чо-то не додумался
    }
}
