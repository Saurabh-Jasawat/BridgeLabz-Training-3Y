package thisStaticFinal;
public class Vehicle {
    private static String manufacturer = "Unknown";
    private final String vehicleNumber;
    private String model;
    private double price;

    public Vehicle(String vehicleNumber, String model, double price) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.price = price;
    }

    public static void setManufacturer(String m) {
        manufacturer = m;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Manufacturer: " + manufacturer);
            System.out.println("Vehicle Number: " + vehicleNumber);
            System.out.println("Model: " + model);
            System.out.println("Price: ₹" + price);
        }
    }

    public static void main(String[] args) {
        Vehicle.setManufacturer("Tata Motors");
        Vehicle v1 = new Vehicle("UP-32-AB-1234", "Nexon", 1200000);
        Vehicle v2 = new Vehicle("DL-01-XY-5678", "Harrier", 1800000);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
