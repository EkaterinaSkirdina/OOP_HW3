package SeminarsHW.HW3;

import java.util.Comparator;

public class SortByName implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getName().compareTo(cat2.getName());
    }

}
