public class addBefore
{
  public Node head;
  Node tail=head;
  int[]a={10,20,30,40};
  public addBefore()
  {
    head=new Node(a[0],null,null);
  }
  public  void main(String[]args)
  {
    int count=1;
    while(count<a.length);
    {
      Node mn= new Node(a[count],null,null);
      tail=mn;
      tail=tail.next;
      mn=tail.prev;
    }
    for(Node n=head;n!=null;n=n.next)
    {
      System.out.print(n.element+" ");
    }
    Node x=new Node(20,null,null);
    addBefore(20,20);
    for(Node n=head;n!=null;n=n.next)
    {
      System.out.print(n.element+" ");
    }
  }
  public static void addBefore(Node x, Object val)
  {
    Node newNode=new Node(val,null,null);
    for(Node n=head;n!=null;n=n.next)
    {
      if((n.element).equals(x.element))
      {
        x.prev=newNode;
        x.prev.next=newNode;
      }
    }
  }
}