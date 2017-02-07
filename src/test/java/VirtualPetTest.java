

import org.junit.Assert;
import org.junit.Test;

public class VirtualPetTest {

	private static final int EXPECTED_RANDOM_NUMBER = 3;

	@Test
	public void shouldGetHungrier() {

		// arrange
		VirtualPet underTest = new NonRandomVirtualPet("under test");

		// in the real world (don't worry if you don't understand this)
		// it's the same as the above
		underTest = createNonRandomPet();

		// act
		underTest.tick();

		// assert
		int baseHungerIncreasePerTick = 5;
		int expectedHunger = baseHungerIncreasePerTick + EXPECTED_RANDOM_NUMBER;

		Assert.assertEquals(expectedHunger, underTest.getHunger());
	}
	
	private VirtualPet createNonRandomPet() {
		VirtualPet newPet = new VirtualPet("under test") {
			@Override
			public int generateRandom() {
				return EXPECTED_RANDOM_NUMBER;
			}
		};
		return newPet;
	}

}
