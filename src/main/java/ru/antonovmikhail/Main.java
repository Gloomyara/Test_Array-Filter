package ru.antonovmikhail;

import ru.antonovmikhail.arrayfilter.ArrayFilter;
import ru.antonovmikhail.arrayfilter.Filter;

import java.util.Arrays;

import static ru.antonovmikhail.arrayfilter.ArrayFilter.filterArray;

public class Main {
    public static void main(String[] args) {
        Filter filter = o -> Integer.parseInt(o.toString());
        String[] in = {"1", "2", "3"};
        System.out.println(Arrays.toString(filterArray(in, filter)));
    }
}
