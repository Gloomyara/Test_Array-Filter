package ru.antonovmikhail.arrayfilter;

import java.util.Arrays;

public class ArrayFilter {

    public static Object[] filterArray(Object[] in, Filter filter) {
        if (in == null) return null;
        return Arrays.stream(in).map(filter::apply).toArray();
    }
}
