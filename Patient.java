package thisStaticFinal;
public class Patient {
    private static String hospitalName = "City Hospital";
    private final int patientId;
    private String name;
    private int age;
    private String disease;

    public Patient(int patientId, String name, int age, String disease) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Disease: " + disease);
        }
    }

    public static void main(String[] args) {
        Patient.setHospitalName("Apollo Hospitals");
        Patient p1 = new Patient(201, "Amit", 35, "Fever");
        Patient p2 = new Patient(202, "Meera", 29, "Diabetes");
        p1.displayPatientDetails();
        p2.displayPatientDetails();
    }
}
