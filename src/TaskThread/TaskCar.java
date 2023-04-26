package TaskThread;

import entity.Car;
import entity.Person;

import java.util.ArrayList;
import java.util.List;

public class TaskCar  implements Runnable{
    List<Car> carList;

    public TaskCar(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public void run() {
        System.out.println("=============Show Cars===============");
        for(Car car : carList){
            System.out.println(car.toString());
        }
    }
}
