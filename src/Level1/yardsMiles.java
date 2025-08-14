package Level1;
import java.util.*;
public class yardsMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();
        double yards = distanceInFeet / 3;
        double miles = yards / 1760;
        System.out.println("The distance in yards is " + yards + " and in miles is " + miles);
    }
}
