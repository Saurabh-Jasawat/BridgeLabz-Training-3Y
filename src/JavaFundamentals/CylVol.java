package JavaFundamentals;
import java.util.*;
public class CylVol {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        double Vol=(3.14*r*r*h);
        System.out.println(Vol);
    }
}
