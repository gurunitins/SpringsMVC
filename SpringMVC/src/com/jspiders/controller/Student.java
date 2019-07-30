package com.jspiders.controller;

import java.sql.Date;
import java.util.ArrayList;

public class Student {
private String studentName;
private String hobby;
private long studentMobile;
private  Date studentDOB;
private  ArrayList<String> studentSkill;


public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getHobby() {
	return hobby;
}
public void setHobby(String hobby) {
	this.hobby = hobby;
}
public Date getStudentDOB() {
	return studentDOB;
}
public void setStudentDOB(Date studentDOB) {
	this.studentDOB = studentDOB;
}
public long getStudentMobile() {
	return studentMobile;
}
public void setStudentMobile(long studentMobile) {
	this.studentMobile = studentMobile;
}
public ArrayList<String> getStudentSkill() {
	return studentSkill;
}
public void setStudentSkill(ArrayList<String> studentSkill) {
	this.studentSkill = studentSkill;
}



}
