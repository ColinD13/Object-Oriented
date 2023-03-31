public class Car {
    private String make;
    private String model;
    private String year;
    private double mileage;
    private double price;

    public Car(String make, String model, String year, double mileage, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public Car() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota","Corolla","2007",1234.32,4000);
        Car c2 = new Car("Buick","Lucerne","2007",60000.64,2000);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}