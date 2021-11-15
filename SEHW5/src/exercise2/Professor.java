package exercise2;

public class Professor extends Employee {
	
	public Course[] courses;
	public Exam[] exams;

	public Professor(String name, int eld, Exam[] exams, Course[] courses) {
		super(name, eld);
		this.courses=courses;
		this.exams=exams;
	} 
	
	public void publish_course() {
		for (int i=0;i<courses.length;i++) {
			courses[i].setPublished(true);
		}
	}
	public static void assign_TA() {
		
	}
	public static void addNewCourse() {
		
	}

}
