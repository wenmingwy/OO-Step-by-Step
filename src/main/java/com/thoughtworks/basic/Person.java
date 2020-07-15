package com.thoughtworks.basic;


public class Person {
    private String name;
    private String age;
    //构造函数
    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
    //introduce方法
    public String introduce(){
        return "My name is Tom. I am 21 years old.";
    }
    //set get方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
