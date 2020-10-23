public class ListQueue implements Queue{
    int size;
    Node front;
    Node rear;
    
    
    public ListQueue(){
        size = 0;
        front = null;
        rear = null;
    }
    public int size()
    {
      return size;
    }
    public boolean isEmpty()
    {
      boolean empty=false;
      if(size==0)
      {
        empty=true;
      }
      return empty;
    }
    public void enqueue(Object o) throws QueueOverflowException
    {
      if(isEmpty()==true)
      {
        Node mn=new Node(o,null);
        front=mn;
        rear=mn;
        size++;
      }
      else
      {
      Node mn=new Node(o,null);
      rear.next=mn;
      rear=mn;
      size++;
      }
    }
     public Object dequeue() throws QueueUnderflowException
     {
       if(isEmpty()==true)
       {
         throw new QueueUnderflowException();
       }
       else
       {
       Object temp=front.val;
       Node old=front;
       front=front.next;
       size--;
       old=null;
       return temp;
       }
     }
     public Object peek() throws QueueUnderflowException
     {
       Object temp=front.val;
       return temp;
     }
      public String toString()
      {
        String ab=" ";
        for(Node n=front;n!=null;n=n.next)
        {
          ab=ab+n.val+" ";
        }
        return "["+ab+"]";
      }
      public Object[] toArray()
      {
        Object temp[]=new Object[size];
        int c=0;
        for(Node n=front;n!=null;n=n.next)
        {
          temp[c]=n.val;
          c++;
        }
        return temp;
      }
       public int search(Object o)
       {
         int c=0;
         for(Node n=front;n!=null;n=n.next)
         {
           if(o.equals(n.val))
           {
             return c;
           }
           c++;
         }
         return -1;
       }
       
//TO DO
}