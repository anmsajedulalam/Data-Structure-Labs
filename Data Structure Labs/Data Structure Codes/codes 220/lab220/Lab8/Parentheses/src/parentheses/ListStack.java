

package parentheses;


public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
    public int size(){
         return size;
     }
    
      public boolean isEmpty(){
          boolean b=false;
          if(size==0){
             b=true;
          }
        return b;
      }
    public void push(Object e){
        
        Node n=new Node(null,null);
        n.val=e;
        n.next=top;
        top=n;
        size++;
    }
   public Object pop() throws StackUnderflowException{
       Object tmp=null;
       if(size==0){
           throw new StackUnderflowException("ListUnderflow");
       }else{
           tmp=top.val;
           top.val=null;
           top=top.next;
           size--;
       }
       
       return tmp;
    }
    public Object peek() throws StackUnderflowException{
        if(size==0){
           throw new StackUnderflowException("ListUnderflow");
       }
        return top.val;
    }
    public String toString(){
        String s="";
        for(Node n=top;n!=null;n=n.next){
            s=s+n.val+" ";
        }
        return s;
    }
    public Object[] toArray(){
        Object [] tmp=new Object[size];
        
        Node n=top;
        for(int i=0;i<size;i++){
            tmp[i]=n.val;
            System.out.print(n.val+" ");
            n=n.next;
        }
        System.out.println();
        
        
        
        return tmp;
    }
    public int search(Object e){
        int pos=-1;
        Node n=top;
        for(int i=0;i<size;i++){
            if(n.val.equals(e)){
                pos=i;
                break;
            }
            n=n.next;
        }
        return pos;
    }
}