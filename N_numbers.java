import java.util.*;
class N_numbers {
    public static void main(String arg[]){
        int i;
        System.out.println("print 1 to n numbers");
        System.out.println("\nenter the value for n:");
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
        }


    }
}
