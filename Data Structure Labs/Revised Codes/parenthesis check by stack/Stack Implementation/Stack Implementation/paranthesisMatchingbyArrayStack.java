import java.util.*;
public class paranthesisMatchingbyArrayStack
{
  ArrayStack as=new ArrayStack();
  ArrayStack as2=new ArrayStack();
  Scnanner k=new Scanner(System.in);
  String s=k.nextLine();
  char c;
  for(int i=0;i<s.length();i++)
  {
    if(c=='('||c=='{'||c=='[')
    {
      as.push(c);
    }
    if(c==')'||c=='}'||c=']')
    {
      String x=(String)as.pop(c);
      char x=s.charAt();
    }
  }
}