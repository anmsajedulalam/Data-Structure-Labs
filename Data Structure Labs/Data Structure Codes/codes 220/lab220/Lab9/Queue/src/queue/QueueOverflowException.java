package queue;
public class QueueOverflowException extends Exception{
    String msg;
    
    public QueueOverflowException(String m){
        msg=m;
    }

    @Override
    public String toString() {
        return msg; 
    }
    
    
}