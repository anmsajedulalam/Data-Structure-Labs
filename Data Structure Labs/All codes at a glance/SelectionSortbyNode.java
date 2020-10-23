public class SelectionSortbyNode{
  public static Node head;
   public static void main(String[]args)
   {
      Object a[]={50,60,40,20,10,30};
      
      head=new Node(a[0],null);
    Node t=head;
    for(int i=1;i<a.length;i++)
    {
      Node n=new Node(a[i],null);
      t.next=n;
      t=t.next;
    }
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
    selectionSort(head);
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
   
   /**
 * Sort the specified list using selection sort.
 *
 * @param head reference to the first node of the list to sort
 */

public static void selectionSort(Node head) {
    // Empty list or list with a single element is already sorted.
    if (head == null || head.next == null)
        return;

    for (Node n = head; n.next != null; n = n.next) {
        // Find the node with the minimum item, starting at `n'.
        Node minNode = n;
        for (Node p = n.next; p != null; p = p.next) {
            if (((Comparable) p.element).compareTo(minNode.element) < 0)
                minNode = p;
         }
        // Exchange with the first item (within `n'), but only if different
        if (n != minNode) {
            Object tmp = n.element;
            n.element = minNode.element;
            minNode.element = tmp;
        }
    
}
}
}