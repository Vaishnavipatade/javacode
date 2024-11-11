/**
 * Multiplicayion
 */
 class Multiplication {
public static int mul(int m, int n)
{
    int y;
    y=m*n;
    System.out.println("multipliction ="+y);
    return -1;
}
    
}
class MethodStaticmul {
    public static void main(String[] args) {
        Multiplication.mul(3, 9 );
    }
}
