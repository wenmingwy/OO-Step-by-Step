package com.thoughtworks.basic;

import java.util.List;

public class Student extends Person{
    private Integer classNumber;

    public Student() {
    }

    public Student(String name, String age, Integer classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    public String introduce(){
        return "My name is Tom. I am 21 years old. I am a Student of Class 2.";
    }

    public void setClassNumber() {
        this.classNumber = classNumber;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

}
