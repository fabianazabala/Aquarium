package self.fabiana.aquarium;

public class GoldenFish extends Fish {

  GoldenFish(int age, int numberOfFins) {
    super(age, numberOfFins, false, true);
  }

  public boolean swim() {
    System.out.println("The golden fish is swimming in the ocean.");
    return true;
  }
}
