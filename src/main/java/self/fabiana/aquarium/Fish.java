package self.fabiana.aquarium;

abstract class Fish implements AquaticAnimals {

  protected final int age;
  protected final int numberOfFins;
  private final boolean isDangerous;
  private final boolean isAPet;

  Fish(int age, int numberOfFins, boolean isDangerous, boolean isAPet) {
    this.age = age;
    this.numberOfFins = numberOfFins;
    this.isDangerous = isDangerous;
    this.isAPet = isAPet;
  }

  @Override
  public boolean canBeTouched() {
    return isAPet || !isDangerous;
  }
}