public class HelloworldGender extends Helloworld{

	private boolean gender;

	
	public HelloworldGender(String name, boolean gender ){
	super(name);
	this.gender=gender;
	} 
	
		public void Print(){
		if (this.gender)
			System.out.println("Bonjour Mr"+this.name);
		else
			System.out.println("Bonjour Mm"+this.name);
		}		
}
