package exercise2;

public class Project {
	public String name;
	public Student[] members;
	public Course course;
	
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name=n;
	}
	public void addNewMember(Student s) {
		Student[] updated = new Student[this.members.length+1];
		for(int i=0;i<members.length;i++) {
			updated[i]=members[i];
		}
		updated[updated.length-1]=s;
		this.members=updated;
	}
	public Student[] getMembers() {
		return this.members;
	}

}
