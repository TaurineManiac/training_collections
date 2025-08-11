import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        List<Integer> liist = new ArrayList();//мы можем так делать т.к. arraylist реализует интерфейс лист
        //т.е. мы можем сделать даже так
        liist = new LinkedList<Integer>();
        //крч по факту ничего интересного,по факту под капотом просто создание новых массивов,мде

    }
}
