package entity;

public class Car {
    private String name;
    private int yearProduction;
    private int idOwner;

    public String getName() {
        return name;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public Car(String name, int yearProduction, int idOwner) {
        this.name = name;
        this.yearProduction = yearProduction;
        this.idOwner = idOwner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearProduction=" + yearProduction +
                ", idOwner=" + idOwner +
                '}';
    }
}
