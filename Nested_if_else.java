import java.util.*;
class Nested_if_else {
    public static void main(String[] args) {
        System.out.println("Enter number :");
        Scanner x=new Scanner(System.in);
        int N=x.nextInt();
        if(N>0)
        {
            if (N%2==0) {
                System.out.println(""+N+" is positive and even");
            } else {
                System.out.println(""+N+" is positive and odd");
            }
        }else
        {
            if (N<0) {
                if (N%2==0) {
                   System.out.println(""+N+" is nigative and even "); 
                } else {
                    System.out.println(""+N+" is nigative and odd");
                }
            } else {
                System.out.println("number is zero");
            }
        }
    
    }
}
