package com.stream.work;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        List<String> cities= List.of("Thane","Mumbai","Manmad","Nashik");
        List<String> sortCities= cities.stream().filter(e->e.startsWith("M")).collect(Collectors.toList());
        System.out.println(sortCities);



    }
}
