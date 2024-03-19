package constructor;

public class Student {
			String sname;
			String add;
			long ph;
	public Student(String sname, String add, long ph) {
		this.sname=sname;
		this.add=add;
		this.ph=ph;
	}
	public void sleep() {
		System.out.println(sname+" is sleeping");
	}
	public void learn() {
		System.out.println(sname+" is learning");
	}
	public static void main(String[] args) {
		Student s=new Student("Hari", "hyd", 565666655l);
		s.learn();
		Student s1=new Student("Mahe", "hyd", 565666655l);
		s1.sleep();
		Student s2=new Student("puppy", "srcl", 865666655l);
		s2.sleep();
		s2.learn();
	}
}
