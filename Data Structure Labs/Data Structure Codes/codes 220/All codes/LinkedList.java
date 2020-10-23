public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    // TO DO
    head=new Node(a[0],null);
    Node t=head;
    for(int i=1;i<a.length;i++)
    {
      Node n=new Node(a[i],null);
      t.next=n;
      t=t.next;
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    // TO DO
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
    int c=0;
    for(Node n=head;n!=null;n=n.next)
    {
      c++;
      
    }
    return c; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    // TO DO  
    
    for(Node n=head;n!=null;n=n.next)
    {
      if(n.next==null)
      {
        System.out.print(n.element+".");
      }
      else
      {
        System.out.print(n.element+", ");
      }
    }
    System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    // TO DO
    
    Node n=head;
    if(idx<0)
    {
      return null;
    }
    else
    {
      for(int i=0;i<=idx;i++)
      {
        if(i==idx)
        {
          return n;
        }
        else if(n.next==null)//why ???
        {
          return null;
        }
        n=n.next;
      }
    }
    return null; // please remove this line!
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    // TO DO
    Node n=head;
    if(idx<0)
    {
      return null;
    }
    else
    {
      for(int i=0;i<=idx;i++)
      {
        if(i==idx)
        {
          return n.element;
        }
        else if(n.next==null)
        {
          return null;
        }
        n=n.next;
      }
    }
    return null; // please remove this line!
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    // TO DO
    Node n=head;
    if(idx<0)
    {
      return null;
    }
    else
    {
      for(int i=0;i<=idx;i++)
      {
        if(i==idx)
        {
          Object temp=n.element;//saving to keep old element
          n.element=elem;
          return temp;
        }
        else if(n.next==null)
        {
          return null;
        }
        n=n.next;
      }
    }
    return null; // please remove this line!
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    // TO DO
    int idx=0;
    for(Node n=head;n!=null;n=n.next)
    {
      if(n.element.equals(elem))
      {
        return idx;
      }
      idx++;
    }
    return -1; // please remove this line!
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    // TO DO
    for(Node n=head;n!=null;n=n.next)
    {
      if(n.element.equals(elem))
      {
        return true;
      }
    }
    return false; // please remove this line!
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    // TO DO
    Node copyHead = null;
    Node copyTail = null;
    for (Node n = head; n != null; n = n.next) {
      Node newNode = new Node(n.element, null);
      if (copyHead == null) {
        // First node is special case - head and tail are the same
        copyHead = newNode;//head will change just once on first
        copyTail = copyHead;
      } else {
        copyTail.next = newNode;
        copyTail = copyTail.next;   // same as: copyTail = newNode;
      }
    }
    return copyHead;
  }
  
//    Node listHead=new Node(null,null);
//    Node tailList=new Node(null,null);
//    for(Node n=head;n!=null;n=n.next)
//    {
//      tailList=n;
//      tailList=tailList.next;
//    }
//    return tailList; // please remove this line!
  
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    // TO DO
    Node newHead = null;//new head==for copying/reversing the list
    // We iterate over the nodes in the original list, and add a copy
    // of each node to the *beginning* of the new list, which reverses 
    // the order.
    for (Node n = head; n != null; n = n.next) {
       Node newNode = new Node(n.element, null);//new node==for iterating the original list
      // Add the node's copy to the beginning of the reversed list.
      newNode.next = newHead;//keeping the reference of reversed list.(new head)
      newHead = newNode;
    }
    return newHead;
    // please remove this line!
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    // TO DO
    // Check for invalid index first. Should be between 0 and size (note:
    // note size-1, since we can insert it *after* the tail node (tail 
    // node has an index of size-1).
    int c=0;
    for(Node n=head;n!=null;n=n.next)
    {
      c++;
      
    }
    int size=c;
    if (idx < 0 || idx > size)
    {
      System.out.println("Invalid index");
//        throw new IndexOutOfBoundsExceptionException();
    }
    // Create the new node to hold the element in the list
    Node newNode = new Node(elem, null);
    
    // Remember the special case -- in the beginning of the list, when
    // the head reference changes.
    if (idx == 0) {
        newNode.next = head;
        head = newNode;
    } else {
        // get the predecessor node first
        Node pred = nodeAt(idx - 1);
        newNode.next = pred.next;
        pred.next = newNode;
    }
    
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    // TO DO
    int c=0;
    for(Node n=head;n!=null;n=n.next)
    {
      c++;
      
    }
    int size=c;
    if (index < 0 || index >= size)
    {
      return null;
    }

    // Reference to the removed node.
    Node removedNode = null;
    
    // Remember the special case -- from the beginning of the list, when
    // the head reference changes.
    if (index == 0) {
        removedNode = head;
        head = head.next;
    } else {
        // get the predecessor node first
        Node pred = nodeAt(index - 1);
        removedNode = pred.next;
        pred.next = removedNode.next;
    }
    Object xyz=removedNode.element;
    // Help the GC
    removedNode.element = null;
    removedNode.next = null;

    return xyz;
 // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    // TO DO
        // Bug alert - does it work for empty lists?
    Node oldHead = head;
    head = head.next;

    // Now append the old head to the end of this list. Find the tail,
    // and add the old head after the tail.
    Node tail = head;
    while (tail.next != null)
    {
        tail = tail.next;
    }
    // Now add after tail
    tail.next = oldHead;
    oldHead.next = null;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    // TO DO
    // Bug alert - does it work for empty lists?

    // Need to find tail and it's predecessor (do you see why?)
    Node p = null;
    Node q = head;
    while (q.next != null) {
        p = q;
        q = q.next;
    }

    // Now q points to the tail node, and p points to it's predecessor
    // First make tail the new head 
    q.next = head;
    head = q;

    // make p the tail
    p.next = null;

   
  }
  
}
