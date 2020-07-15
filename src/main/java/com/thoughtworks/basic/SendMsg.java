package com.thoughtworks.basic;

import java.util.List;

public class SendMsg {

    private Attribute attribute;
    private Person person;

    public SendMsg(){

    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public void updateName(String newName){
        person.setName(newName);
    }

    public void updateAttribute(Attribute newAttribute){
        setAttribute(newAttribute);
    }

//当名字改变的时候发送消息
    public void sendMsgForUpdateName(String oldName, String newName){
        if (!oldName.equals(newName)){
            updateName(newName);
            List<Student> students = attribute.getStudent();
            attribute.getTeacher().Message();
            for (int num=0;num<students.size();num++){
                students.get(num).Message();
            }
        }
    }
//当换班级的时候发送消息
    public void sendMsgForUpdateClass(Attribute oldAttribute, Attribute newAttribute){
        if (oldAttribute.getClassNumber() != newAttribute.getClassNumber()){
            updateAttribute(newAttribute);
            List<Student> oldStudents = oldAttribute.getStudent();
            List<Student> newStudents = newAttribute.getStudent();
//            发别向学生和老师发送消息
            oldAttribute.getTeacher().Message();
            newAttribute.getTeacher().Message();
            for (int num=0;num<oldAttribute.getStudent().size();num++){
                oldStudents.get(num).Message();
            }
            for (int num=0;num<newStudents.size();num++){
                newStudents.get(num).Message();
            }
        }
    }


}
