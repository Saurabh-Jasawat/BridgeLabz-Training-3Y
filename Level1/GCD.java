import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1%n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
    }int gcd=n2;
    int lcm=(n1*n2)/gcd;
    System.out.println("gcd");
    System.out.println("lcm");
    
}
