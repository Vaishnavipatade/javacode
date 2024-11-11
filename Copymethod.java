import java.util.Scanner;

public class Copymethod {
    public static void main(String[] args) {
        int x[]=new int[5];
        int y[]=new int[x.length];
        System.out.println("emter arrya element");
        Scanner n=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            x[i]=n.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(x[i]);
        
    }
}
