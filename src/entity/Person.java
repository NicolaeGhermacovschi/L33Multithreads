package entity;

public class Person {
    private String name;
    private int age;
    private int idCar;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getIdCar() {
        return idCar;
    }

    public Person(String name, int age, int idCar) {
        this.name = name;
        this.age = age;
        this.idCar = idCar;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCar=" + idCar +
                '}';
    }
}
