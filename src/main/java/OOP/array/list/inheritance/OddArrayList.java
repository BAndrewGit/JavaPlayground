package OOP.array.list.inheritance;

import java.util.ArrayList;

public class OddArrayList extends ArrayList<Integer> {

    @Override
    public void add(int index, Integer element) {
        if (isOdd(element)) {
            super.add(index, element);
        }
    }

    @Override
    public boolean add(Integer element) {
        if (isOdd(element)) {
            return super.add(element);
        } else {
        return false;
        }
    }

    public static boolean isOdd(int number) {
        return Math.abs(number) % 2 != 0;
    }

}
