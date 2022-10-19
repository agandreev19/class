public class car {
    String brand;
    String model;
    void start(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println(model + " " + brand);
    }
}