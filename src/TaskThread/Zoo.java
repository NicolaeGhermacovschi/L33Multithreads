package TaskThread;

import java.util.ArrayList;
import java.util.List;

public class Zoo extends Thread{
    List<String>  animals = new ArrayList<>();
    public void addAnimals(){
        animals.add("Bear");
        animals.add("Camel");
        animals.add("Donkey");
        animals.add("Rabbit");
        animals.add("Zebra");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Fox");
    }



    @Override
    public void run() {
        addAnimals();
        for (String animal : animals  ) {
            System.out.println(animal);
        }
    }
}
