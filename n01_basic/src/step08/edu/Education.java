package step08.edu;

import step08.person.Student;

public class Education {
	String address;
	int classNum;
	Student student;

	public void setStudent(Student stu){
		student = stu;
	}
	public void setEducation(String addr, int cn, Student stu){
		address = addr;
		classNum = cn;
		student = stu;
	}
	public String getAdddress(){
		return address;
	}
	public int getClassNum(){
		return classNum;
	}
	public Student getStudent(){
		return student;
	}
	public String attend(){
		return "출석!";
	}
}