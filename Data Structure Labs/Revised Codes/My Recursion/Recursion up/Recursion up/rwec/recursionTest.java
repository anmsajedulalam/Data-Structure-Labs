public class recursionTest
{
   public static void main(String[]args)
  {
    recursion r=new recursion();
    System.out.println(r.factorial(5));
     System.out.println(r.fibonacci(5));
     r.binarynumber(10);
     System.out.println();
     int a[]={10,20,30,40,50,60,70,80,90,100};
     System.out.println(r.binarySearch(a,0,a.length-1,30));//array,start,end,key
     System.out.println(r.toThePower(2,4));
     System.out.println(r.greatestCommonDivisor(54,24));
     System.out.println(r.findGCD(54,24));
     
  }
}