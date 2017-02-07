

public class NonRandomVirtualPet extends VirtualPet {

	public NonRandomVirtualPet(String petName) {
		super(petName);
	}

	@Override
	public int generateRandom() {
		return 3;
	}
}
