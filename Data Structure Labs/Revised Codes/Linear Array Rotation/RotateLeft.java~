public class RotateLeft
{
  public static void main(String[]args)
  {
    int [] array={10,20,30,40,50,60,70,80,90,100};
    array=rotateLeft(array,3);
    for(int i=0;i<array.length;i++)
    {
      System.out.print(array[i]+" ");
    }
    System.out.println();
  }
  public static int [] rotateLeft(int [] a, int k)
  {
    int [] b= new int[k];
    int count=a.length-k;
    for(int i=0;i<k;i++)
    {
      b[i]=a[count];
      count++;
    }
    count=a.length-k-1;
    for(int i=a.length-1;i>=k;i--)
    {
      a[i]=a[count];
      count--;
    }
    for(int i=0;i<k;i++)
    {
      a[i]=b[i];
    }
    return a;
  }
}