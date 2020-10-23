public class recursion{
  /*Node head;
   public recursion(int a[])
   {
   head=new Node(a[0],null);
   Node tail=head;//new Node(null,null);
   //    head.next=tail;
   for(int i=1;i<a.length;i++)
   {
   Node mn=new Node(a[i],null);
   tail.next=mn;
   tail=mn;
   }55
   System.out.println("List:");
   for(Node n=head;n!=null;n=n.next)
   {
   System.out.print(n.element+" ");
   }
   System.out.println();
   }*/
  public long factorial(long x)
  {
    if(x==0||x==1)
    {
      return 1;
    }
    else
    {
      long fact=x*factorial(x-1);
      return fact;
    }
  }
  public int fibonacci(int x)
  {
    if(x==1)
    {
      return 0;
    }
    else if(x==2)
    {
      return 1;
    }
    else
    {
      int fib=fibonacci(x-1)+fibonacci(x-2);
      return fib;
    }
  }
  public int binarySearch(int []array,int left,int right, int key)
  {
//    boolean contains=false;
    int mid=(left+right)/2;
    if(key==array[mid])
    {
      return mid;
    }
    else
    {
      if(key>array[mid])
      {
        left=mid+1;
        return binarySearch(array,left,right,key);
//        for(int i=left;i<=right;i++)
//        {
//          if(key==array[i])
//          {
//            contains=true;
//          }
//        }
      }
      else
      {
        right=mid-1;
        return binarySearch(array,left,right,key);
//        for(int i=left;i<=right;i++)
//        {
//          if(key==array[i])
//          {
//            contains=true;
//          }
//        }
      }
    }
//    return -1;
  }
  
  
  
  
  
  
  
  
  
  
  
  /*
   public String binaryConvert(int x)
   {
   if(x==0)
   {
   String ab="0";
   return ab;
   }
   else if(x==1)
   {
   String ab="1";
   return ab;
   }
   else
   {
   String bin="";
   bin=bin+(String)binaryConvert(x%2);
   return bin;
   }
   }*/
  public void binarynumber(int x){
    int remainder = x%2;
    if(x==0)
    {
      System.out.print("0");
      return;
    }
    if(x!=0){
      binarynumber(x/2);
      System.out.print(remainder + " ");
    }
//      else
//      {
//        System.out.print("0");
//      }
  }
  public int toThePower(int base, int power)
  {
    int result=1;
    if(power==0)
    {
      return 1;
    }
    else if(base==0)
    {
      return 0;
    }
    else
    {
      while(power>0)
      {
        result=result*base;
        power--;
        toThePower(base, power);
      }
    }
    return result;
  }
  public int greatestCommonDivisor(int greater, int lower)
  {
    
    int remainder=1;
    if(lower==0)//base case
    {
      return greater;
    }
    else if(lower!=0)
    {
      remainder=greater%lower;
      return greatestCommonDivisor(lower,remainder);
    }
    
    return -1;
  }
  public  int findGCD(int number1, int number2) {
    //base case
    if(number2 == 0){
      return number1;
    }
    return findGCD(number2, number1%number2);
  }
  
  public int toThePowerFast(int base,int power)
  {
    int result=1;
    if(power==0)
    {
      return 1;
    }
    else if(base==0)
    {
      return 0;
    }
    else
    {
      if(power%2==0)
      {
        int halfpower=(int)(power/2);
        result=toThePowerFast(base,halfpower)*toThePowerFast(base,halfpower);
      }
      else
      {
        int halfpower=(int)(power/2);
        result=toThePowerFast(base,halfpower)*toThePowerFast(base,halfpower)*base;
      }
    }
    return result;
  }
  /*
   * private static int list[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
   * 
   public int[] recursiveBubble(int[] args, int startIndex, int endIndex) {
   if(startIndex > endIndex){
   System.out.println("Recursive bubblesort:");
   System.out.println(Arrays.toString(args));
   return args;
   }
   
   if (startIndex == endIndex - 1) {
   recursiveBubble(args, 0, endIndex - 1);
   } else if (args[startIndex] > args[startIndex+1]) {
   int currentNumber = args[startIndex];
   args[startIndex] = args[startIndex + 1];
   args[startIndex + 1] = currentNumber;
   
   recursiveBubble(args, startIndex + 1, endIndex);
   } else  {
   recursiveBubble(args, startIndex + 1, endIndex);
   } 
   return args;
   }*/
  public Node nodeCreator(int a[])
  {
    Node head=new Node(a[0],null);
    Node tail=head;//new Node(null,null);
//    head.next=tail;
    for(int i=1;i<a.length;i++)
    {
      Node mn=new Node(a[i],null);
      tail.next=mn;
      tail=mn;
    }
    System.out.println("List:");
    for(Node n=head;n!=null;n=n.next)
    {
      System.out.print(n.element+" ");
    }
    System.out.println();
    return head;
  }
  public String reversePrintByFindingTail(Node head,String s)
  {
    /*System.out.println("List:");
     for(Node n=head;n!=null;n=n.next)
     {
     System.out.print(n.element+" ");
     }
     System.out.println();//okay till this*/
    
    if(head==null)
    {
      return s;
    }
    else if(head.next==null)
    {
      s=s+String.valueOf(head.element);//if you add space here, it wont work
      return s;
    }
    else
    {
      return reversePrintByFindingTail(head.next,s)+" "+String.valueOf(head.element);
    }//finding tail
//    ab=ab+tail.element+" ";
//    tail=null;
////    reversePrintByFindingTail(head);
//    reversePrintByFindingTail(head);
//    }
//    else if(head.next==null)
//    {
//      ab=ab+head.element;
//    }
    
//    while(head.next!=null)//base
//    {
//     reversePrintByFindingTail(head);
//    }
//    if(head.next!=null)//base case
//    {
//      ab=ab+head.element;
//    }
//    return ab;
  }
  public void findMin()
  {
    
  }
  public Object [] sortArray()
  {
    return null;
  }
  
  /*
   public Node findMinNode(Node l) {
   if(l==null)
   {
   return null;
   }
   else if (l.next == null){ 
   return l;
   }
   else {
   Node minNode = l;
   Node minNodeRest = findMinNode(l.next);
   if (minNodeRest.element < l.element)
   minNode = minNodeRest;
   return minNode;
   }
   }
   
   public void selectSort(Node l) {
   if (l == null || l.next == null){
   return;
   }
   else {
   Node minNode = findMinNode(l);
   swap(l, minNode);
   selectSort(l.next);
   }
   }
   public void normalPrint(Node m)
   {
   System.out.print(m.element+" ");
   m=m.next;
   return normalPrint(m);
   }
   */
  
  public int[] bubblesortByRecursion(int[] array, int start, int end) 
  {
    if(start > end){
      System.out.println("Bubble Sort By Recursion: ");
//      System.out.println(Arrays.toString(array));
      return array;
    }
    
    if (start == end- 1) 
    {
      bubblesortByRecursion(array, 0, end - 1);
    } 
    else if (array[start] > array[start+1]) 
    {
      int currentNumber = array[start];
      array[start] = array[start + 1];
      array[start + 1] = currentNumber;
      
      bubblesortByRecursion(array, start + 1, end);
    } 
    else 
    {
      bubblesortByRecursion(array, start + 1, end);
    } 
    return array;
  }
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  /*
   public static int binarysearch(int x, int leftend, int rightend ){
   if(leftend>rightend){
   return -1;
   }
   
   int mid = (leftend + rightend)/2;
   if(x== a[mid]){
   return mid;
   }else if( x>a[mid]){
   return binarysearch(x, mid+1,rightend);
   }else if(x<a[mid]){
   return binarysearch(x, leftend, mid-1);
   }
   return -1;
   
   
   }
   public static void binarynumber(int x){
   int remainder = x%2;
   if(x!=0){
   binarynumber(x/2);
   System.out.print(remainder + " ");
   }
   }
   }
   class Node{
   public Object element;
   public Node next;
   
   public Node(Object e, Node n){
   element =e ;
   next = n;
   
   }
   public void insert (Object val, head){
   Node mn = new Node (val, null);
   if(head ==null){
   
   }
   }
   
   }*/
  
  
  
  
