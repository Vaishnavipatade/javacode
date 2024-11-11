public class Return_valueF1 {
    int mult()
    {
        int a=10;
        int b=20;
        int c=a*b;
        return(c);
    }
    public static void main(String[] args) {
        Return_valueF1 v=new Return_valueF1();
         int result=v.mult();
         System.out.println( "multiplication is:"+result);
    }
}
