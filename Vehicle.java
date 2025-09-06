package Instance;
public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Aman", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(7000);
        Vehicle v2 = new Vehicle("Saurabh", "Bike");
        v2.displayVehicleDetails();
    }
}
