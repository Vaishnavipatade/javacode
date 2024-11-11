class Vaireble
{
    private int x=10;
    private int y=8;

 public int get()
 {
    return y;
 }
 public int getX()
 {
    return x;
 }
 public void setX(int x)
 {
    this.x=x;
 }
 public void setY(int y)
 {
    this.y=y;
 }
}
class Private_vaireble
{
    public static void main(String[] args) {
        Vaireble s=new Vaireble();
      System.err.println(s.getX());
     s.setX(45);
     System.out.println("the changed number is="+s.getX());
        
    }
}


















