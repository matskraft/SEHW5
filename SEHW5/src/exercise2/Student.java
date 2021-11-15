package exercise2;

public class Student {
	public String name;
	public int StudentId;
	public Project[] project;
	public Course[] courses;
	public Exam[] exam;
	
	public String getName() {
		return this.name;
	}
	public Project[] getProjects() {
		return this.project;
	}
	
	public boolean isPartOf(Course cou) {
		for(int i=0;i<courses.length;i++) {
			if(courses[i].equals(cou)) {
				return true;
			}
		}
		return false;
	}

}
