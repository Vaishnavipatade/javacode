/*print 5 numbers from 10 numbers continus */
import java.util.*;
class Break {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.println("enter number:");
    int n=x.nextInt();
    for( int i=0;i<=n;i++)
    {
      if (i==6) {
        break;
      } 
      System.out.println("print numbers="+i);
    }
}
}
