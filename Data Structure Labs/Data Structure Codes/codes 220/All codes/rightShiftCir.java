public class rightShiftCir
{
  static int start=4;
  static int size=5;
  public static void main(String[]args)
  {
    int cir[]={40,50,0,0,10,20,30};
    cir=rightShiftCir(cir,3);
    int count=start;
    for(int i=0;i<cir.length;i++)
    {
      System.out.print(cir[count]+" ");
      count=(count+1)%cir.length;
    }
    System.out.println();
  }
  public static int [] rightShiftCir(int []c,int k)
  {
    for(int j=0;j<k;j++)
    {
      int from=((start+size)%c.length)-1;
      int to=(from+1)%c.length;
      
      for(int i=0;i<size;i++)
      {
        c[to]=c[from];
        to=from;
        from=from-1;
        if(from<0)
        {
          from=c.length-1;
        }
      }
    }
    start=(start+k)%c.length;
    return c;
  }
}