package self.fabiana.aquarium;

public class Shark extends Fish {

  Shark(int age, int numberOfFins) {
    super(age, numberOfFins, true, false);
  }

  @Override
  public boolean swim() {
    System.out.println("The shark is swimming in the ocean.");
    return true;
  }

  public void attack() {
    System.out.println("The shark has just attacked");
  }
}
