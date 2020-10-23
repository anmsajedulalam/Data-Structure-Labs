public class ArrayStack implements Stack{
    int size;
    int top;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        top =-1;
        data = new Object[5];
    }
    
    public int size()
    {
      return size;
//      int c=0;
//      for(int i=0;i<data.length;i++)
//      {
//        c++;
//      }
//      return c;
    }
    public boolean isEmpty()
    {
      if(size==0)
      {
        return true;
      }
      else
      {
        return false;
      }
      
    }
    public void push(Object e) throws StackOverflowException
    {
      if(size==data.length)
      {
         throw new StackOverflowException();
      }
      else
      {
        top++;
      data[top]=e;
      size++;
      }
    }
    public Object pop() throws StackUnderflowException
    {
      if(top==-1)
      {
        throw new StackUnderflowException();
      }
      else{
      Object temp=data[top];
      data[top]=null;
      top--;
      size--;
      return temp;
      }
    }
    public Object peek() throws StackUnderflowException
    {
      if(top==-1)
      {
       throw new StackUnderflowException();
      }
      else
      {
        return data[top];
      }
    }
     public String toString()
     {
       String ab=" ";
       for(int c=0;c<data.length;c++)
       {
         if(c==0)
         {
           ab="[ "+data[c];
         }
         else if(c==data.length-1)
         {
           ab=ab+" "+data[c]+" ]";
         }
         else
         {
           ab=ab+ " "+data[c];
         }
       }
       return ab;
     }
     public Object[] toArray()
     {
       int c=top;
       Object temp[]=new Object[size];
       for(int i=0;i<temp.length;i++)
       {
         temp[i]=data[c];
        c--;
       }
       return temp;
     }
     public int search(Object e)
     {
       for(int i=0;i<size;i++)
       {
         if(data[i].equals(e))
         {
           int temp=top-i;
           return temp;
         }
       }
       return -1;
       }
     
}