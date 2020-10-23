

package recursion;


public class BinaryConversion {
    public static void main(String [] args){     
            binConvert(10);
        }
    
    public static void binConvert(int n){
        if(n>0){
            binConvert(n/2);
            System.out.println(n%2+"");
        }
        
    }
}
