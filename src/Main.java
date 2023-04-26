import TaskThread.TaskCar;
import TaskThread.TaskPerson;
import TaskThread.Zoo;
import entity.Car;
import entity.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("==============Start program===========");
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Nicolae", 52, 1));
        people.add(new Person("Ion", 51, 2));
        people.add(new Person("Andrei", 42, 3));
        people.add(new Person("Petru", 22, 6));
        people.add(new Person("Anton", 32, 5));
        people.add(new Person("Bob", 82, 4));

        Thread task = new Thread(new TaskPerson(people));
        task.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", 2000, 2));
        cars.add(new Car("BMW", 2010, 3));
        cars.add(new Car("Merceds", 2008, 1));
        cars.add(new Car("Audi", 2015, 4));
        cars.add(new Car("Audi", 2018, 6));
        cars.add(new Car("Merceds", 2020, 5));

        Thread showCar = new Thread(new TaskCar(cars));
        showCar.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        (new Zoo()).start();
        System.out.println("=============End Program===============");
    }
}