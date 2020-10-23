public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;//Making it Doubly
            tail=tail.next;//new tail
        }
        tail.next=head; // Making it circular
        head.prev=tail;//For Doubly
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
        // TO DO
        int c=0;
        for(Node n=head;n.next!=head;n=n.next)
        {
          c++;
        }
        return c; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        // TO DO    
      for(Node n=head.next;n.next!=head.next;n=n.next)//n!=head
      {
        if(n==head.next||n.next!=head)
        {
        System.out.print(n.element+", ");
        }
        else if(n.next==head)
        {
          System.out.print(n.element+".");
        }
      }
      System.out.println();
    }
    
    public void backwardprint(){
        // TO DO  
      for(Node n=head.prev;n.prev!=head.prev;n=n.prev)//n!=head
      {
         if(n==head.prev||n.prev!=head)
        {
        System.out.print(n.element+", ");
        }
        else if(n.prev==head)
        {
          System.out.print(n.element+".");
        }
      }
      System.out.println();
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO
        Node n=head.next;
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
    for(Node n=head.next;n!=head;n=n.next)//n.next!=head.next
    {
      if(n.element.equals(elem))
      {
        return idx;
      }
      idx++;
    }
        
        
        return -1; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){//insertion
        // TO DO
      int c=0;
    for(Node n=head.next;n!=head;n=n.next)//n.next!=head.next
    {
      c++;//counting the nodes
      
    }
    int size=c;
    if (idx < 0 || idx > size)
    {
      System.out.println("Invalid index");
    }
    else{
      Node pred = null;
    if (idx == 0)
    {
        pred = head;
    }
    else{//    else can be used here
        pred = head.next;//connceting the predecessor in head.next, passing it to head.next
        for (int i = 0; i < idx - 1; i++)
        {
            pred = pred.next;
        }
    }
    }
//    Node succ=pred.next.next;//creating successor for insertion
//    Node mn=new Node(elem,null,null)//creating the node which will be inserted
//    mn.next=succ;//connecting the inserting node to succesor
//    mn.prev=pred;//connecting the inserting node to predeccesor
//    pred.next=mn;//inserting on pred.next
//    succ.prev=mn;//inserting on succ.prev
    Node p=pred;
    
    
    // Create the new node to hold the element in the list
    Node n = new Node(elem, null, null);//here Object elem is given

    // Now add it after the predecessor `p'
    Node q = p.next;            // q will refer to the next node 
    n.next = q;
    n.prev = p;
    p.next = n;
    q.prev = n;

    // Done -- no special cases whatsoever!

}
//     Node z=nodeAt(idx);  
//      Node pred = null;
//    if (index == 0)
//        pred = header;
//    else {
//        pred = header.next;
//        for (int i = 0; i < index - 1; i++)
//            pred = pred.next;
//    }
//Node find out finish
//    Node n = new Node(elem, null, null);
//    n=z;
//    n.next=z.next;
//    n.prev=z.prev;
    
    
    
    // Now add it after the predecessor 'p'
//    Node q = head.next;            // q will refer to the next node 
//    n.next = head;
//    n.prev = p;
//    p.next = n;
//    q.prev = n;

    // Done -- no special cases whatsoever!
//    return n;

   
//    if (idx == 0) {
//        newNode.next = head;
//        head= newNode;
//    } else {
//        
//        Node pred = nodeAt(idx - 1);
//        newNode.next = pred.next;
//        pred.next = newNode;
//    }
    
    
    
    
    
    
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){//Removal
        // TO DO
      int idx=index;
         int c=0;
    for(Node n=head.next;n!=head;n=n.next)
    {
      c++;
      
    }
    int size=c;
    if (idx < 0 || idx > size)
    {
      System.out.println("Invalid index");
    }
    
    Node n=nodeAt(idx);
    Object xyz=n.element;
    
        // References to the predecessor and successor
    Node p = n.prev;
    Node q = n.next;

    // Remove node n.
    p.next = q;
    q.prev = p;

    // Unlink 'n' from the list.
    n.next = n.prev = null;
// Help GC
    n.element = null;
        return xyz; // please remove this line!
    }
    
    
   
   }
    
    
    
