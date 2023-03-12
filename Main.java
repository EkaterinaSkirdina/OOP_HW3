package SeminarsHW.HW3;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListOfCats cats = new ListOfCats();
        cats.setCatList(Arrays.asList(
                new Cat("yashka", 3),
                new Cat("murzik", 5),
                new Cat("vas'ka", 1),
                new Cat("barsik", 7)));

        System.out.println("-----------Iterator--------------");

        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            Cat cat = iterator.next();
            System.out.println("name = " + cat.getName() + " age = " + cat.getAge());
        }

        System.out.println("-----------Sort by name--------------");

        cats.getCatList().sort(new SortByName());
        for (Cat cat : cats) {
            System.out.println("name = " + cat.getName() + " age = " + cat.getAge());
        }

        System.out.println("-----------Sort by age--------------");

        cats.getCatList().sort(new SortByYear());
        for (Cat cat : cats) {
            System.out.println("name = " + cat.getName() + " age = " + cat.getAge());
        }
    }
}
