package thisStaticFinal;
public class Student {
    private static String collegeName;
    private final int rollNumber;
    private String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public static void setCollegeName(String name) {
        collegeName = name;
    }

    public static void displayCollegeName() {
        System.out.println("College: " + collegeName);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("CGPA: " + cgpa);
        }
    }

    public static void main(String[] args) {
        Student.setCollegeName("NIT Delhi");
        Student.displayCollegeName();
        Student s1 = new Student(101, "Saurabh", 8.23);
        Student s2 = new Student(102, "Priya", 9.10);
        s1.displayStudentDetails();
        s2.displayStudentDetails();
    }
}
