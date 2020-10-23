package queue;

public class ListQueue implements Queue {

    int size;
    Node front;
    Node rear;

    public ListQueue() {
        size = 0;
        front = null;
        rear = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
       if(size==0){
            return true;
        }else{
            return false;
        } 
    }

    public void enqueue(Object o){
        if(size==0){
            Node temp=new Node(o,null);
            front=temp;
            rear=temp;
        }else{
            Node temp=new Node(o,null);
            rear.next=temp;
            rear=rear.next;
        }
        size++;
    }

    public Object dequeue() throws QueueUnderflowException {
        Object temp;
        if(size==0){
            throw new QueueUnderflowException("Queue Underflow");
        }else{
            temp=front.val;
            front.val=null;
            front=front.next;
            size--;
            return temp;
        }
    }

    public Object peek() throws QueueUnderflowException {
        if(size==0){
            throw new QueueUnderflowException("Queue Underflow");
        }else{
            return front.val;
        }
    }

    public String toString() {
        String s="";
        Node tmp=front;
        for(int i=0;i<size;i++){
            s=s+tmp.val+" ";
            tmp=tmp.next;
        }
        return s;
    }

    public Object[] toArray() {
        Object []tmp=new Object[size];
        Node idx=front;
        for(int i=0;i<size;i++){
            tmp[i]=idx.val;
            idx=idx.next;
        }
        return tmp;
    }

    public int search(Object o) {
        int pos=-1;
        Node temp=front;
        for(int i=0;i<size;i++){
            if(temp.val.equals(o)){
                pos=i;
                break;
            }
            temp=temp.next;
        }
        return pos;
    }
}
