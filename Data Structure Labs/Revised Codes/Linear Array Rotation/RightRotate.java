public class RightRotate
{
  public static void main(String[] args)
  {
    int[] array={10,20,30,40,50,60,70,80,90};
    for(int i=0;i<array.length;i++)
    {
      System.out.print(array[i]+" ");
    }
    System.out.println();
    array=rightRotate(array,3);
    for(int i=0;i<array.length;i++)
    {
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
  public static int[] rightRotate(int[] a,int k)
  {
    int[] b=new int[k];
    for(int i=0;i<k;i++)
    {
      b[i]=a[i];
    }
    int count=0;
    for(int i=k;i<a.length;i++)
    {
      a[count]=a[i];
//      System.out.println(a[count]);
      count++;
    }
    count=a.length-k;
    for(int i=0;i<k;i++)
    {
      a[count]=b[i];
      count++;
    }
      return a;
  }
}