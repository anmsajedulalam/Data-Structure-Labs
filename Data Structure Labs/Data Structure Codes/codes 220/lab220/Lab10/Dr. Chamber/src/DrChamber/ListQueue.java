package DrChamber;

public class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }

 
    public int size() {
        return size;
    }

   
    public boolean isEmpty() {
        boolean f=false;
        if(size==0){
            f=true;
        }
        return f;
    }

   
    public void enqueue(Object e) throws QueueOverflowException {
        if (size == 0) {
            Node temp = new Node(e, null);
            front = temp;
            rear = temp;

        } 
        else {
            Node temp = new Node(e, null);
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    
    public Object dequeue() throws QueueUnderflowException {
        Object rt = null;
        if (size == 0) {
            throw new QueueUnderflowException("Queue Underflow Exception");
        } else {
            rt = front.val;
            front = front.next;
            size--;
        }

        return rt;
    }

    
    public Object peek() throws QueueUnderflowException {
        Object elem = null;
        if (size == 0) {
            throw new QueueUnderflowException("Queue Underflow Exception");
        } else {
            elem = front.val;
        }
        return elem;
    }

    
    public int search(Object o) {
        int pos=-1;
        Node front=this.front;
        for(int i=0;i<size;i++){
            if(front.val.equals(o)){
                pos=i;
                break;
            }
            front=front.next;
        }
        return pos;
    }

    
    public Object[] toArray() {
        Object []tmp=new Object[size];
        Node first=front;
        for(int i=0;i<size;i=i+1){
            tmp[i]=first.val;
            first=first.next;
        }
        return tmp;
    }

    
    public String toString() {
        String s="";
        Node pos=front;
        for(int i=0;i<size;i++){
            s+=pos.val+"\t";
            pos=pos.next;
        }
        return s;
    }
    
    
    
}