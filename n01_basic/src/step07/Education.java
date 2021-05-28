package step07;

class Education{
	int classNumber;
	String teacherName;
	String subject;
	
	public void setInfo(int cn, String t, String s){
		classNumber = cn;
		teacherName = t;
		subject = s;
	}
	
	public int getclassNumber(){
		return classNumber;
	}
	public String getteacherName(){
		return teacherName;
	}
	public String getsubject(){
		return subject;
	}
	public String getInfo(){
		return "classNumber : " + classNumber + " teacherName: " + teacherName + " subject : " + subject;
	}
}