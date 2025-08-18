import java.util.*;
public class Primes{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t =scn.nextInt();
        for(int i=0;i<=t;i++){
            int n = scn.nextInt();
            int count=0;
            for(int div=1;div<=n;div++){
                if(n%div==-0){
                    count++;
                }
            }  if(count==2){
                System.out.println("Prime");
            }    else {
                System.out.println("Not Prime");
            }  
        } 
    }
}
        /*int x=2;
        int count=0;
        while(count<n){
            boolean t=true;
            for(int i=2;i*i<=x;i++){
                if(x%i==0){
                    t=false;
                    break;
                }
            }
            if(t==true){
                count++;
                System.out.println(x+" ");
            }
            x++;
        }
    }
}*/