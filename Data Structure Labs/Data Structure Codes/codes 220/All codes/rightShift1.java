public class rightShift1
{
  public static int start=4;
  public static int size=7;
  public static void main(String[] args)
  {
    int[] cir={60,70,0,0,10,20,30,40,50};//if there will no space then work after saving start to any other place
    rightShift(cir,3);
  }
  public static void rightShift(int[] cir,int k)
  {
    for(int c=0;c<k;c++)
    {
      int from=(start+size)%cir.length-1;
      int to=(from+1)%cir.length;
      for(int i=0;i<size;i++)
      {
        cir[to]=cir[from];
        to=from;
        from=from-1;
        if(from<0)
        {
          from=cir.length-1;
        }
      }
      cir[start]=0;
      start=(start+1)%cir.length;
    }
    int count=start;
    for(int i=0;i<cir.length;i++)
    {
      System.out.print(cir[i]+" ");
      count=(count+1)%cir.length;
    }
    System.out.println();
  }
}