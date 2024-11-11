 class varible{
    public int a=10;
    public int b=12;
    public int c=0;
 }
 class addtion
 {
    void sum()
    {
    varible x=new varible();
    x.c=x.a+x.b;
    System.out.println("addtion is :"+x.c);
    }
    
 }
 class mult
 {
    void multiplication()
 {
    varible y=new varible();
    y.c=y.a*y.b;
    System.out.println("multiplication is :"+y.c);
 }
 }
 class substraction{
    void sub()
        {
    varible m=new varible();
    m.c=m.a-m.b;
    System.out.println("substraction is :"+m.c);
        }
 }
 class div
 {
    void division()
    {
    varible n=new varible();
    n.c=n.a/n.b;
    System.out.println("division is :"+n.c);
    }
 }
 class mod{
    void moduls()
    {
    varible r=new varible();
    r.c=r.a%r.b;
    System.out.println("modulus is:"+r.c);

    }
}
/**
 * public1
 */
public class public1 {

    public static void main(String[] args) {
        addtion k=new addtion();
        k.sum();
        mult l=new mult();
        l.multiplication();
        substraction t=new substraction();
        t.sub();
        mult g=new mult();
        g.multiplication();
        div s=new div();
        s.division();
        mod p=new mod();
        p.moduls();



    }
}