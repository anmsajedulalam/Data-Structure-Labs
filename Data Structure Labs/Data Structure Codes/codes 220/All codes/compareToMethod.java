public class compareToMethod
{
  public static void main(String[]args)
  {
    Object a=10;
    Object b=20;
    if(((Comparable)a).compareTo(b)==0)
    {
      System.out.println(a+" and "+b+" are equal");
    }
    else if(((Comparable)a).compareTo(b)>0)
    {
      System.out.println(a+" is greater than "+b);
      System.out.println(b+" is less than "+a);
    }
    else if(((Comparable)a).compareTo(b)<0)
    {
      System.out.println(b+" is greater than "+a);      
      System.out.println(a+" is less than "+b);
    }
  }
}