import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Animal> animals =  new ArrayList<>();

    // add animals here
    animals.add(new Cat());
    animals.add(new ExampleAnimal());
    animals.add(new Chinchilla());
    animals.add(new Skunk());
    animals.add(new Sheep()); //Roebrto's Animal
    animals.add(new Pikachu());
    animals.add(new Frog());
    animals.add(new Giraffe());
    animals.add(new Shrew());
    animals.add(new Snake());
    animals.add(new Bear());
		animals.add(new Tiger());

    // make some noise!
    for(Animal a : animals) {
      a.makeNoise();
    }
    


    //make animals eat
    animals.get(2).eat();

    
  }


}