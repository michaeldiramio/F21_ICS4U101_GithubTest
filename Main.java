import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Animal> animals =  new ArrayList<>();

    // add animals here
    animals.add(new Cat());
    animals.add(new ExampleAnimal());
    animals.add(new Chinchilla());


    // make some noise!
    for(Animal a : animals) {
      a.makeNoise();
    }

    //make animals eat
    animals.get(2).eat();

    
  }


}