package com.assignments.exception;

class Student {
	private int rollno;
	private String sname;
	private String saddress;
	private StudentResult srobj;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public StudentResult getSrobj() {
		return srobj;
	}
	public void setSrobj(StudentResult srobj) {
		this.srobj = srobj;
	}
	public Student(int rollno, String sname, String saddress, StudentResult srobj) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.saddress = saddress;
		this.srobj = srobj;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress + ", srobj=" + srobj + "]";
	}
	
	
}

public class StudentResult extends Student{

	public StudentResult(int rollno, String sname, String saddress, StudentResult srobj) {
		super(rollno, sname, saddress, srobj);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
