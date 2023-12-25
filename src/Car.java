
public class Car {
    private String make;
    private String model;
    private int year;

    public Car() {
        this.make = "Nepoznato";
        this.model = "Nepoznato";
        this.year = 2015;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
}
}