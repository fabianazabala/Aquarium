package self.fabiana.aquarium;

public class Dolphin extends Fish {

  private boolean jumps;

  Dolphin(int age, int numberOfFins, boolean jumps) {
    super(age, numberOfFins, false, false);
    this.jumps = jumps;

  }

  public boolean swim() {
    System.out.println("The dolphin is swimming in the ocean.");
    return true;
  }

  public void jump() {
    System.out.println("The dolphin has swum");
  }
}
