package TaskThread;
import entity.Person;
import java.util.List;

public class TaskPerson implements Runnable {
    List<Person> people;

    public TaskPerson(List<Person> people) {
        this.people = people;
    }

    @Override
    public void run() {
        System.out.println("=============Show Person===============");
        for(Person person : people){
            System.out.println(person.toString());
        }
    }
}
