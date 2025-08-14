package Level1;
import java.util.*;
public class kmToMilesInput {
    public static void main(String[] args) {
        double km;
        Scanner sc = new Scanner(System.in);
        km = sc.nextInt();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}


