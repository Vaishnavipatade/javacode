import java.util.Scanner;

public class Sortarryaasending {
    public static void main(String[] args) {
        int x[]=new int[]{5,9,8,6,4};
        //System.out.println("enter element for sorting");
        //Scanner n=new Scanner(System.in);
    /* for(int i=0;i<x.length;i++)        
        {
            x[i]=n.nextInt();
        }
        for(int i=0;i<x.length;i++)        
        {
            System.out.println(x[i]);
        }*/
        System.out.println("Sorrting element by assending order is:");
        for(int k=0;k<x.length;k++)        
           {
            for(int j=k+1;j<x.length;j++)
            {
                int temp=x[k];
                    x[k]=x[j];
                    x[j]=temp;
     
            }
           }
    }
}
