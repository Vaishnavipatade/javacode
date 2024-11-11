public class Parameter_return {
    String concatente(String m, String n){
        String x=m+n;
        return(x);
    }
    public static void main(String[] args) {
        Parameter_return v=new Parameter_return();
        String result =v.concatente("java", "probraming");
        System.out.println(result);
    }
}
