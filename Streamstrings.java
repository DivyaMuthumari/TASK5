package com.task5;

import java.util.stream.Stream;

class Streamstrings {

    public static void main(String[] args)
    {

       Stream names= Stream.of("aBc","d","ef")
        .map(String::toUpperCase);
                names.forEach(System.out::println);


    }
}

