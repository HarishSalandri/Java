package methods;

public class Students {
	String name;
	int sId;
	long ph;
	String adress;
	public void details() {
		System.out.println("Student details: "+this.name+", "+this.sId+", "+this.ph+", "+this.adress);
	}
	public static void main(String[] args) {
		Students s=new Students();
		s.name="harish";
		s.sId=47;
		s.ph=563469694l;
		s.adress="Hyderabad";
		s.details();	
		
	}
}
