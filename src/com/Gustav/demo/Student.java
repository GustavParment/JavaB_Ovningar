package com.Gustav.demo;



public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private boolean isTired;



    public Student(String name, int age, boolean isTired) {
        setName(name);
        setAge(age);
        setTired(isTired);




    }

    public void setName(String name) {
        this.name = name;
    }




    public void setAge(int age) {
        this.age = age;
    }

    public void setTired(boolean tired) {
        isTired = tired;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsTired() {
        return isTired;
    }

    @Override
    public String toString() {
        return getName() + " " + getAge() +  " " +  getIsTired();

    }


    @Override
    public int compareTo(Student o) {

        return 0;

    }
}
