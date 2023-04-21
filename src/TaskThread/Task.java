package TaskThread;

import entity.Car;
import entity.Person;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public void task() throws InterruptedException {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Nicolae",52,1));
        people.add(new Person("Ion",51,2));
        people.add(new Person("Andrei",42,3));
        people.add(new Person("Petru",22,6));
        people.add(new Person("Anton",32,5));
        people.add(new Person("Bob",82,4));

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW",2000,2));
        cars.add(new Car("BMW",2010,3));
        cars.add(new Car("Merceds",2008,1));
        cars.add(new Car("Audi",2015,4));
        cars.add(new Car("Audi",2018,6));
        cars.add(new Car("Merceds",2020,5));
        Thread.sleep(10000);
        new Thread(() ->{
            System.out.println("=============Show Person===============");
            for(Person person : people){
                System.out.println(person.toString());
            }
        }).start();

        new Thread(() ->{
            System.out.println("=============Show Cars===============");
            for (Car car : cars){
                System.out.println(car.toString());
            }
        }).start();

        new Thread(() -> {
            System.out.println("=============Show Cars and Owner===============");
            for(Person person : people){
                for(Car car : cars){
                    if(person.getIdCar() == car.getIdOwner()){
                        System.out.println(person.getName() + " " + car.getName() + " " + car.getYearProduction());
                    }
                }
            }
        }).start();

    }
}
