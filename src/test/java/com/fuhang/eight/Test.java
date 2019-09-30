package com.fuhang.eight;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<String> temp = Arrays.asList("a", "b", "c");

        temp.forEach(e -> System.out.println(e));

        Map map = temp.stream().collect(Collectors.groupingBy(str -> str.split(",")));




    }
}
