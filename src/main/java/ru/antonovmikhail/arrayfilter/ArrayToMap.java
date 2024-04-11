package ru.antonovmikhail.arrayfilter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayToMap {
    public static Map<Object, Integer> arrayToMap(Object[] objects){
        if (objects == null) return null;
        Map<Object, Integer> map = new HashMap<>();
        Arrays.stream(objects).forEach(o -> map.put(o, map.getOrDefault(o, 0) + 1));
        return map;
    }
}
