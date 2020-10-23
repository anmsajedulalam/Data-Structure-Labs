package recursion;

/**
 *
 * @author Fahim
 */
public class PowerDivision {

    public static void main(String[] args) {
        System.out.println(powerDiv(4, 9));
    }
    public static int power(int m,int n){
        if(n==1){
            return m;
        }else{
            int res=m*power(m,(n-1));
            return res;
        }
    }
    public static int powerDiv(int m, int n) {
        if(n%2==0){
            return power(m,n/2)*power(m,n/2);
        }else{
            return m*power(m,n/2)*power(m,n/2);
        }
    }
}
