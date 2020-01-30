package self.fabiana.aquarium;

public interface AquaticAnimals {

  boolean swim();

  default void jump() {
    System.out.println("The fish jumps");
  }

  default void attack() {
    System.out.println("The fish attacked");
  }

  boolean canBeTouched();
}
// interfaces are the definition of behavior
//they force classes and objects to have certain properties