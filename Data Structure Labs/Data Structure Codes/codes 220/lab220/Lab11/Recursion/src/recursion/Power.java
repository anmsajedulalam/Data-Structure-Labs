

package recursion;

/**
 *
 * @author Fahim
 */
public class Power {
    public static void main(String [] args){
        System.out.println(power(6,6));
    }
    
    public static int power(int m,int n){
        if(n==1){
            return m;
        }else{
            int res=m*power(m,(n-1));
            return res;
        }
    }
}
