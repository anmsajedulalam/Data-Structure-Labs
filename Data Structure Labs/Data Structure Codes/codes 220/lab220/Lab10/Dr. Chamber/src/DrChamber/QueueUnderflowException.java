package DrChamber;
public class QueueUnderflowException extends Exception{
    String msg;
    
    public QueueUnderflowException(String m){
        msg=m;
    }

    @Override
    public String toString() {
        return msg; 
    }
    
    
}