package com.stream.work;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
       List<Integer> list1= List.of(2,4,5,8,47,65,123,41,15,10);

       List<Integer> list2= new ArrayList<>();
       list2.add(2);
        list2.add(4);
        list2.add(5);
        list2.add(8);
        list2.add(47);

        List<Integer> listEven=new ArrayList<>();
        for(Integer i:list1)
        {
            if(i%2==0)
            {
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);

            //using stream API
        Stream<Integer> stream= list1.stream();
        List<Integer> streamEvenList= stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(streamEvenList);

        List<Integer> streamlist4=list1.stream().filter(i->i>15).collect(Collectors.toList());
        System.out.println(streamlist4);


    }
}
