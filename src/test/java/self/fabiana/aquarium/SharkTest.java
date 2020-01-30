package self.fabiana.aquarium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SharkTest {

  private AquaticAnimals shark;

  @Before
  public void setUp() {
    shark = new Shark(4, 3);
  }

  @Test
  public void givenSharkThenShouldSwim() {
    assertTrue(shark.swim());
  }
}