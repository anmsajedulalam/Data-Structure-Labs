

package parentheses;

public class StackOverflowException extends Exception{
    
    String msg="";
    public StackOverflowException(String m){
        msg=m;
    }

    @Override
    public String toString() {
        return msg;
    }
    
}
