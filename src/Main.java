import TaskThread.Task;
import TaskThread.Zoo;
import entity.Car;
import entity.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        System.out.println("==============Start program===========");
        Task task = new Task();
        try {
            task.task();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        (new Zoo()).start();
        System.out.println("=============End Program===============");
    }
}