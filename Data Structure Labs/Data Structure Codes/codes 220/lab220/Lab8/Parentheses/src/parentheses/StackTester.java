

package parentheses;


public class StackTester {
    public static void main(String [] args){
        ArrayStack arr=new ArrayStack();
        ListStack list=new ListStack();
        try{
            //Array Stack
            System.out.println("*****Array stack******");
            arr.push(20);
            arr.push(30);
            arr.push(40);
            System.out.println(arr);
            System.out.println(arr.pop());
            System.out.println(arr.search(30));
            arr.toArray();
            
            //List Stack
            System.out.println("********List stack********");
            list.push(20);
            list.push(30);
            list.push(40);
            System.out.println(list);
            System.out.println(list.pop());
            System.out.println(list.search(30));
            list.toArray();
            
        }catch(StackOverflowException e){
            System.out.println(e);
     }catch(StackUnderflowException e){
            System.out.println(e);
        }
    }
}
