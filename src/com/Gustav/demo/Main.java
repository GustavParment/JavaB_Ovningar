package com.Gustav.demo;

import java.security.Key;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    TestLists scores = new TestLists();


     scores.linkedListMethod();
     scores.arrayListMethod();

        List<Student> studentList = new ArrayList<>();


        for (int i = 15; i < 20 ; i++) {


            Student student = new Student("Player " + i);
            studentList.add(student);




        }
        for (Student student : studentList){
            System.out.println(student.name);
        }










    }
}
