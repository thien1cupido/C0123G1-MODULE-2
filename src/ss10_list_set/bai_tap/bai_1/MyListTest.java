package ss10_list_set.bai_tap.bai_1;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(5);
        listInteger.add(1);
        listInteger.add(3);
        listInteger.add(2);
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println(listInteger.get(i));
        }
        listInteger.add(2, 3);
        for (int i = 0; i < listInteger.size(); i++) {
            System.out.println(listInteger.get(i));
        }
    }
}
