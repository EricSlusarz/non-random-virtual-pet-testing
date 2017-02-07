

import java.util.Random;

public class VirtualPet {

	// attributes make up the object's state
	private String name;

	private int hunger;
	
	private Random generator = new Random();


	public VirtualPet(String petName) {
		name = petName;
	}
	
	public int getHunger() {
		return hunger;
	}
	
	public void tick() {
		hunger += (5 + generateRandom());
	}
	
	/**
	 * generates a pseudorandom number from 0-5
	 */
	public int generateRandom() {
		return generator.nextInt(6);
	}
	
	@Override
	public String toString() {
		return name + ", who has a hunger level of " + hunger;
	}
}
