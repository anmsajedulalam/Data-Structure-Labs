

package lab6;

public class DoublyList{
    public Node head;
    Node tail;
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object []a){
        head = new Node(a[0], null, null);
        tail = head;
        
        for(int i = 1; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        int size=0;
        for(Node n=head.next;n!=head;n=n.next){
            size++;
        }
        if(size==0){
            return 0;
        }else{
            size++;
        }
        return size; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        Node n;
        System.out.print(head.element+" ");
        for(n=head.next;n!=head;n=n.next){
            System.out.print(n.element+" ");
        }
        System.out.println();
    }
    
    public void backwardprint(){
        Node n;
        System.out.print(tail.element+" ");
        for(n=tail.prev;n!=tail;n=n.prev){
            System.out.print(n.element+" ");
        }
        System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        Node n=head;
        for(int i=0;i<idx;i++){
            n=n.next;
        }
        
        return n; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        int i=1;
        if(head.element.equals(elem)){
            return 0;
        }else{
            for(Node n=head.next;n!=head;n=n.next){
                if(n.element.equals(elem)){
                    break;
                }
                i++;
            }
        }
        
        return i; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        if(idx==0){
            Node n=new Node(elem,null,null);
            n.next=head;
            head.prev=n;
            head=n;
            n.prev=tail;
            tail.next=n;
        }else if(idx==countNode()){
            Node n=new Node(elem,null,null);
            tail.next=n;
            n.prev=tail;   
            n.next=head;
            head.prev=n;
            tail=n;
        }
        
        else{
            Node n=new Node(elem,null,null);
            Node pred=nodeAt(idx-1);
            Node succ=nodeAt(idx);
            succ.prev=n;
            pred.next=n;
            n.prev=pred;
            n.next=succ;
        }
    }
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        Node r=null;
        if(index==0){
            r=head;
            head=head.next;
            head.prev=tail;
            tail.next=head;
        }else if((index+1)==countNode()){
            r=nodeAt(index);
            Node pred=nodeAt(index-1);
            pred.next=head;
            head.prev=pred;
            tail=pred;
        }
        else{
            r=nodeAt(index);
            Node pred=nodeAt(index-1);
            Node succ=nodeAt(index+1);
            pred.next=pred.next.next;
            succ.prev=succ.prev.prev;
        }   
        return r.element; // please remove this line!
    }
}