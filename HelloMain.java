public class HelloMain{

	public static void main(String[] args) {
			Helloworld n1 = new Helloworld("Mamadou");
			
			HelloworldGender ng1 = new HelloworldGender("Mamadou", true);
			
			Helloworld n2 = new Helloworld("Marie");
			
			HelloworldGender ng2 = new HelloworldGender("Marie", false);
			n1.Print();
			n2.Print();
			ng1.Print();
			ng2.Print();

}
}
