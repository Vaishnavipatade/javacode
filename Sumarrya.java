import java.util.Scanner;

class Sumarrya {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("\n enter element to arrya");
        Scanner n=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=n.nextInt();
        }
        
        for(int i=1;i<a.length;i++)
        {
            sum=a[i]+sum;
        }
        System.out.println("the sum of arrya element is ="+sum);
    }
    
}
