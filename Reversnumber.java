public class Reversnumber {
    public static void main(String[] args) {
        int num =12345;
        int reversnumber=0;
        while (num !=0) {
            reversnumber=reversnumber*10+num %10;
            num /= 10;
        }
        System.out.println("reversed number is:"+reversnumber);
    }
    
}
