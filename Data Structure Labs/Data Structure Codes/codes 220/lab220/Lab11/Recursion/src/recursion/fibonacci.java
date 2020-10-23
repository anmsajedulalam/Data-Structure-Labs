

package recursion;

/**
 *
 * @author Fahim
 */
public class fibonacci {
    public static void main(String [] args){
        System.out.println(fibonacci(8));
    }
    
    public static int fibonacci(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            int res=fibonacci(n-1)+fibonacci(n-2);
            return res;
        }
    }
}
