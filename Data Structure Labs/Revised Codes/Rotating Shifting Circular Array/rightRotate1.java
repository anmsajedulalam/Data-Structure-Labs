public class rightRotate1
{
  public static int start=4;
  public static int size=7;
  public static void main(String [] args)
  {
    int[] cir={60,70,0,0,10,20,30,40,50};
    rightRotate(cir,3);
  }
  public static void rightRotate(int[] cir,int k)
  {
    int[] temp=new int[k];
    int from=(start+size-k)%cir.length;
    if(from<0)
    {
      from=cir.length-1;
    }
    for(int c=0;c<k;c++)
    {
      temp[c]=cir[from];
      from=(from+1)%cir.length;
    }
    from=(start+size-k)%cir.length-1;
    int to=(from+k)%cir.length;
    for(int c=0;c<size-k;c++)
    {
      cir[to]=cir[from];
      from=from-1;
      if(from<0)
      {
        from=cir.length-1;
      }
      to=to-1;
      if(to<0)
      {
        to=cir.length-1;
      }
    }
    to=start;
    for(int c=0;c<k;c++)
    {
      cir[to]=temp[c];
      to=(to+1)%cir.length;
    }
    int count=start;
    for(int c=0;c<cir.length;c++)
    {
      System.out.print(cir[count]+" ");
      count=(count+1)%cir.length;
    }
    System.out.println();
    count=start;
    for(int c=0;c<size;c++)
    {
      System.out.print(cir[count]+" ");
      count=(count+1)%cir.length;
    }
    System.out.println();
    for(int c=0;c<size;c++)
    {
      System.out.print(cir[c]+" ");
    }
    System.out.println();
    count=0;
    for(int c=0;c<size;c++)
    {
      System.out.print(cir[count]+" ");
      count=(count+1)%cir.length;
    }
    System.out.println();
  
  }
}