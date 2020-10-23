

package recursion;

/**
 *
 * @author Fahim
 */
public class Gcd {
    public static void main(String [] args){
        System.out.println(gcd(12,8));
    }
    static int res=0;
    public static int gcd(int m,int n){
        if(n%m==0){
            res=m;
           
        }else{
            gcd(n%m,m);
        }
         return res;
    }
}
