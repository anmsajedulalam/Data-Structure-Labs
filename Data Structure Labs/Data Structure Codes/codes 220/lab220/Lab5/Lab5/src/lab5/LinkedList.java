

package lab5;


public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++){
        Node n=new Node(null,null);
        n.element=a[i];
        tail.next=n;
        tail=n;
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  int size=0;
  public int countNode(){
      
    for(Node n=head;n!=null;n=n.next){
        size++;
    }
    return size; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    for(Node n=head;n!=null;n=n.next){
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
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    Node n=head;
    for(int i=0;i<idx;i++){
        n=n.next;
    }
    return n.element; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    if(idx>size){
        return null;
    }
    Node n=head;
    for(int i=0;i<idx;i++){
        n=n.next;
    }
    Object oldelem=n.element;
    n.element=elem;
    return oldelem; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int i=0;
    Node n;
    for(n=head;n!=null;n=n.next){
       if(n.element.equals(elem)){
           break;
       }
       i++;
    }
    if(n==null){
        return -1;
    }
    return i; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    boolean b=false;
    Node n;
    for(n=head;n!=null;n=n.next){
       if(n.element.equals(elem)){
           b=true;
           break;
       }
       
    }
    
    return b; // please remove this line!
  } // please remove this line!
  
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node newHead=new Node(head.element,null);
    Node newTail=newHead;

    for (Node n=head.next;n!=null;n=n.next){
        Node newNode=new Node(null,null);
        newNode.element=n.element;
        newTail.next=n;
        newTail=n;
    }
    
    return newHead; // please remove this line!
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
      Node newHead=new Node(head.element,null);
    Node tail=newHead;
    for(Node n=head.next;n!=null;n=n.next){
        Node newNode=new Node(null,null);
        newNode.element=n.element;
        newNode.next=newHead;
        newHead=newNode;
    }
    
    return newHead; // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    
      if(idx==0){
        Node n=new Node(elem,null);
        n.next=head;
        head=n;
    }else{
        Node pred=nodeAt(idx-1);
        Node n=new Node(elem,null);
        n.next=pred.next;
        pred.next=n;
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
    }else{
          Node pred=nodeAt(index-1);
          r=nodeAt(index);
          pred.next=pred.next.next;
         }
      
    return r.element; // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
      Node n;
      Node copy=new Node(head.element,null);
      for(n=head.next;n.next!=null;n=n.next){}
      n.next=copy;
      head=head.next;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
      Node n;
      int i=0;
    for(n=head;n.next!=null;n=n.next){
        i++;
    }
    Node pred=nodeAt(i-1);
    
    Node copy=new Node(n.element,null);
    pred.next=null;
    
    copy.next=head;
    head=copy;
  }
  
}