
package queue;


public class QueueTester {
    public static void main(String [] args){
        ArrayQueue arr=new ArrayQueue();
        ListQueue list=new ListQueue();
        try{
            System.out.println("****Array****");
            arr.enqueue(10);
            arr.enqueue(20);
            arr.enqueue(30);
            arr.enqueue(40);
            System.out.println(arr);
            arr.dequeue();
            System.out.println(arr);
            System.out.println(arr.search(30));
            arr.dequeue();
            System.out.println(arr);
            System.out.println(arr.size);
            
            System.out.println("****List****");
            list.enqueue(10);
            list.enqueue(20);
            list.enqueue(30);
            list.enqueue(40);
            System.out.println(list);
            list.dequeue();
            System.out.println(list);
            System.out.println(list.search(30));
            list.dequeue();
            System.out.println(list);
            System.out.println(list.size);
    
        }catch(QueueOverflowException e){
            System.out.println(e);
        }catch(QueueUnderflowException e){
            System.out.println(e);
        }
    }
}
