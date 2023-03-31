package com.epam.mjc;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> list1;
        list1 = list.stream().filter(x -> (x % 2 == 0)).collect(Collectors.toList());
        return list1;
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        int value;
        value = list.stream().max(Comparator.naturalOrder()).get();
        return Optional.of(value);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        List<Integer> bigList = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        int value = bigList.stream().min(Comparator.naturalOrder()).get();
        return Optional.of(value);
    }

    public Integer sum(List<Integer> list) {
        return list.stream().reduce(Integer::sum).get();
    }
}
