package com.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Astudents {
    public static void main(String args[]){
        List<String> students=new ArrayList<>();
        students.add("Arivu");
        students.add("Brinda");
        students.add("Karthi");
        students.add("Ayla");
        students.add("Siva");
        students.add("Anbu");
        students.add("Rashmi");
        students.add("Vimal");
        students.add("Abi");
        students.add("Vahi");
        List<String> names=students.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
System.out.println(names);

    }
}
