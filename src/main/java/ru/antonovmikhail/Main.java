package ru.antonovmikhail;

import ru.antonovmikhail.arrayfilter.Filter;

import java.util.Arrays;
import java.util.Comparator;

import static ru.antonovmikhail.arrayfilter.ArrayFilter.filterArray;
import static ru.antonovmikhail.arrayfilter.ArrayToMap.arrayToMap;

public class Main {
    public static void main(String[] args) {
        Filter filter = o -> Integer.parseInt(o.toString());
        String[] in = {"1", "2", "3", "1", "1", "2"};
        //Фильтр фильтр
        System.out.println(Arrays.stream(filterArray(in, filter)).max(Comparator.comparingInt(o -> (int) o)));
        //Мапа
        System.out.println(arrayToMap(in));
    }
}
