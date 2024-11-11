/**
 * Primenumber
 */
import java.util.*;
public class Primenumber {

    public static void main(String[] args) {
        {
            System.out.println(("enter number:"));
            Scanner x=new Scanner(System.in);
            int n=x.nextInt();
            int i,m;
            m=n%2;
            if (m!=0) {
                System.out.println(""+n+"  is a prime number");
                
            } else {
                System.out.println(""+n+"  is not prime numbre");
            }

        }
    }
}