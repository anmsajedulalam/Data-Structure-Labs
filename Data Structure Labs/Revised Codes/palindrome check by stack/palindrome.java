import java.util.*;
public class palindrome
{
  
  public static void main(String[]args)
  {
    ArrayStack as=new ArrayStack();
     ArrayStack asp=new ArrayStack();
   Scanner k=new Scanner(System.in);
   String s=k.nextLine();
   char temp[]=s.toCharArray();
   boolean palindromic=false;
   try{
   for(int i=0;i<=(s.length())/2;i++)
   {
     as.push((Object)temp[i]);
   }
   for(int i=(s.length()-1);i>=((s.length())/2)-1;i--)
   {
     asp.push((Object)temp[i]);
   }
   for(int i=0;i<=(s.length())/2;i++)
   {
     if((as.pop()).equals(asp.pop()))
     {
        palindromic=true;
     }
     else
     {
        palindromic=false;
       break;
     }
   }
   }
   catch (Exception e)
   {
     System.out.println("Exception");
   }
      if(palindromic==true)
   {
     System.out.println("Palindrome");
   }
   else
   {
     System.out.println("Not Palindrome");
   }
   }
}
//   int i=0;
//   int j=temp.length-1;
//   boolean palindromic=false;
//   while(i<j)
//   {
//     if(temp[i].equals(temp[j]))
//     {
//       palindromic=true;
//     }
//     i++;
//     j--;
//   }
//   if(palindromic==true)
//   {
//     System.out.println("Palindrome");
//   }
//   else
//   {
//     System.out.println("Not Palindrome");
//   }
  
