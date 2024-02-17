package com.stream.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        Stream<Objects> emptyStream= Stream.empty();
        String names[]={"Aakash","vishakha","Bhavik"};
        Stream<String> stream1=Stream.of(names);
        stream1.forEach(e ->
        {
            System.out.println(e);
        });
        Stream<Object> streamBuilder=Stream.builder().build();

        IntStream stream= Arrays.stream(new int[]{2,4,8,6,15,45});
        stream.forEach(i->{
            System.out.print(i);
        });
        List<Integer> list2= new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(5);
        list2.add(8);
        list2.add(47);

        Stream<Integer> stream2=list2.stream();
        stream2.forEach(e->{
            System.out.println(e);
        });

    }

}
