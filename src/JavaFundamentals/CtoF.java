package JavaFundamentals;
import java.util.*;
public class CtoF {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float c= Float.parseFloat(sc.next());
        float f=((c * 9/5) + 32);
        System.out.println(f);
    }
}
