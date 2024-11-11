public class Return_moduls {
    int mod()
    {
        int a=10;
        int b=9;
        int  c=a%b;
        return(c);
    } public static void main(String[] args) {
        Return_moduls x=new Return_moduls();
        int result=x.mod();
        System.out.println("the moduls of given values is :"+result);
    }
}
