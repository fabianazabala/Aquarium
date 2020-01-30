package self.fabiana.aquarium;

public class Main {
  public static void main(String[] args) {

    AquaticAnimals dolphin = new Dolphin(3, 2, true);
    AquaticAnimals shark = new Shark(4, 3);
    AquaticAnimals goldenFish = new GoldenFish(1, 2);


    //Aquatic animals is an interface that requires to have that swim method

    dolphin.swim();
    dolphin.jump();
    shark.swim();
    shark.attack();
    goldenFish.swim();

    System.out.println("Can touch dolphin: " + dolphin.canBeTouched());
    System.out.println("Can touch shark: " + shark.canBeTouched());
    System.out.println("Can touch golden fish: " + goldenFish.canBeTouched());

    // so far i have 3 implementations of self.fabiana.aquarium.AquaticAnimals interface

  }
}
