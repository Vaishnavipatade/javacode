public class evenodd {
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("enter the number you want to cheak:");
        n=s.nextInt();
        if (n%2==0) {
            System.out.println("the given number "+n+" is even");
            }
            else
            {
                 System.out.println("the given number "+n+ "is odd");
            }
    }
    
}
