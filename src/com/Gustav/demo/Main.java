package com.Gustav.demo;


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        List<Student> students = new ArrayList<>();

        Student benny = new Student("Benny", 15,true);
        Student frida = new Student("Frida", 22,false);





        students.add(benny);
        students.add(frida);
        students.sort(Collections.reverseOrder());
        System.out.println(students);

        System.out.println(benny.getAge() + " " +  benny.getName());
        System.out.println(frida.getAge() + " " + frida.getName());



       /* System.out.println("List before swapping: " + students );

        Collections.swap(students, 0 ,1);

        System.out.println("List after swapping: " + students);*/




    }


}




