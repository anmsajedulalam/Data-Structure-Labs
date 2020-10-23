
package recursion;

public class factorial {
    public static void main(String [] args){
        System.out.println(factorial(4));
    }
    
    public static int factorial(int n){
        int res=0;
        if(n==1){
            return 1;
        }else{
            res=n*factorial(n-1);
            return res;
        }
        
    }
}
