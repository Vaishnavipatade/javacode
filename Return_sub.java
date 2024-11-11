public class Return_sub {
    int sub()
    {
        int a=20;
        int b=2;
        int c=a-b;
        return(c);
    }
    public static void main(String[] args) {
        Return_sub m=new Return_sub();
        int substraction=m.sub();
        System.out.println("the substraction is:"+substraction);
    }
}
