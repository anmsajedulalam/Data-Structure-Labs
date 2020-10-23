

package stack;


public class StackUnderflowException extends Exception{
     String msg="";
    public StackUnderflowException(String m){
        msg=m;
    }

    @Override
    public String toString() {
        return msg;
    }
}