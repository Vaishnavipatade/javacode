public class Parameter_returnadd {
    int addtion(int x,int y)
    {
        int c=x+y;
        return c;
    }
    public static void main(String[] args) {
        Parameter_returnadd v=new Parameter_returnadd();
        int result=v.addtion(12, 30);
        System.out.println("the addtion is: "+result);

    }
}
