

public class VirtualPetApp {

	public static void main(String[] args) {
		VirtualPet horace = new VirtualPet("Horace");
		
		horace.tick();
		horace.tick();
		horace.tick();
		
		System.out.println("My pet " + horace);
		// is the same as
		System.out.println("My pet " + horace.toString());
	}

}
