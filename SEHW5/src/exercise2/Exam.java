package exercise2;

public class Exam {
	
	public int max_value;
	public Course course;
	public Question[] questions;
	public Student[] student;
	
	public Exam(int value, Course cou, Question[] que, Student[] stu) {
		this.max_value=value;
		this.course=cou;
		questions= new Question[que.length];
		student= new Student[stu.length];
		for (int i=0;i<questions.length;i++) {
			questions[i]=que[i];
		}
		for (int i=0;i<student.length;i++) {
			student[i]=stu[i];
		}
	}
	
	public boolean register(Student stu) {
		if(stu.isPartOf(course)) {
			Student[] studentNew= new Student[student.length+1];
			for(int i=0;i<student.length;i++) {
				studentNew[i]=student[i];
			}
			studentNew[student.length+1]=stu;
			return true;
		}
		return false;
	}

}
