package exercise2;

public class Course {
	
	public int id;
	public String name;
	public int maxCapacity;
	public boolean isFull;
	public Professor prof; //[1] checken
	public Student[] student;
	public Exam[] exam;
	private boolean published;
	
	public void setPublished(boolean pb) {
		if(pb) {
			if(this.name!=null&&this.prof!=null&&this.id!=0) {
				this.published=true;
				return;
			}
		}
		this.published=false;
	}
	
	public Student[] getStudents() {
		return this.student;
	}

}
