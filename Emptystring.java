package com.task5;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Emptystring {
    public static void main(String[] args){
       List<String> listStrings=Arrays.asList("abc","","bc","efg","abcd","","jkl");
       List<String> nonEmptyStrings=listStrings.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
       System.out.println(nonEmptyStrings);


    }
}