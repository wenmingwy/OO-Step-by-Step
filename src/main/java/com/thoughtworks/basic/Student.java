package com.thoughtworks.basic;

import com.thoughtworks.basic.SendMsg;
public class Student extends Person{
    private SendMsg sendMsg;

    public Student() {
    }

    public String introduce(){
        return "My name is Tom. I am 21 years old. I am a Student of Class 2.";
    }

// 当信息改变的时候发送消息
    public void Message(){
        System.out.println("My name is Tom. I am 21 years old. I am a student of Class 2 now.");
    }

}
