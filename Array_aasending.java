public class Array_aasending {
    public static void main(String[] args) {
        int m[]={4,9,7,3,1};
        int temp=0;
        System.out.println("Elements of original array:");
    
        for( int i=0;i< m.length;i++){
            System.out.println(m[i]+"");
        }
        for( int i=0;i<m.length;i++)
      {
        for(int j=i+1;j<m.length;j++){
            if(m[i]>m[j]){
               temp=m[j];
               m[j]=m[i];
               m[i]=temp;
            }
        }
      }
      
       System.out.println("element of arrya sorted in ascending order:");
       for(int i=0;i<m.length;i++)
System.out.println(m[i]);    
}
}
