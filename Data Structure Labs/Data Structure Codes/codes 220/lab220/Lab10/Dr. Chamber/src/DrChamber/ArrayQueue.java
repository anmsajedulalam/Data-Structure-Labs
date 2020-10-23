package DrChamber;
public class ArrayQueue implements Queue{
    int size;
    int front;
    int rear;
    Object [] data;
    
    public ArrayQueue(){
        size=0;
        front = -1;
        rear = -1;
        data = new Object[5];
    }
    
    public int size(){
        return size;
    }   
    public boolean isEmpty(){
        if(size==0){
            return true;
        }else{
            return false;
        } 
    }
    public void enqueue(Object o) throws QueueOverflowException{
        if(size==data.length){
            throw new QueueOverflowException("Queue Overflow");
        }else if(front==-1){
            front=(front+1)%data.length;
            rear=(rear+1)%data.length;
            data[rear]=o;
            size++;
            
        }else{
            rear=(rear+1)%data.length;
            data[rear]=o;
            size++;
        }
    }
    public Object dequeue() throws QueueUnderflowException{
        
        if(size==0){
            throw new QueueUnderflowException("Queue Underflow");
        }else{
           Object tmp=data[front];
           data[front]=null;
           size--;
           front=(front+1)%data.length;
           return tmp;
        }
    }
    public Object peek() throws QueueUnderflowException{
        if(size==0){
            throw new QueueUnderflowException("Queue Underflow");
        }else{
            return data[front];
        }
        
    }
    public String toString(){
        String s="";
        int tmp=front;
        for(int i=0;i<size;i++){
            s=s+data[tmp]+" ";
            tmp=(tmp+1)%data.length;
        }
        return s;
    }
    public Object[] toArray(){
        Object []tmp=new Object[size];
        int idx=front;
        for(int i=0;i<size;i++){
            tmp[i]=data[idx];
            idx=(idx+1)%data.length;
        }
        return tmp;
    }
    public int search(Object o){
        int pos=-1;
        int tempFront=front;
        for(int i=0;i<size;i++){
            if(data[tempFront].equals(o)){
                pos=i;
                break;
            }
            tempFront=(tempFront+1)%data.length;
        }
        return pos;
    }
}