

package DrChamber;
import java.util.Scanner;
public class DrChamber {
    ArrayQueue arr=new ArrayQueue();
    ListQueue list=new ListQueue();
    Scanner sc=new Scanner(System.in);
    
    int id=0;
    
    public void registerPatient(){
        try {
            System.out.println("Enter name");
            String name=sc.nextLine();
            id++;
            Patient p=new Patient(id,name);
            
            //arr.enqueue(p);
            list.enqueue(p);
        } catch (QueueOverflowException e) {
            System.out.println(e);
        }
    }
    public void servePatient(){
        try{
            //Object patient=arr.dequeue();
            Object patient=list.dequeue();
            System.out.println("Served Patient : \n"+patient);
            System.out.println();
        }catch(QueueUnderflowException e){
            System.out.println(e);
        }
    }
    public void cancelAll(){
        try{
            while(list.size>0){
                list.dequeue();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void canDoctorGoHome(){
        if(list.isEmpty()==true){
            System.out.println("Doctor can go home");
        }else{
            System.out.println("Doctor can NOT go home");
        }
        System.out.println();
    }
    public void showAllPatient(){
        //Object []array=arr.toArray();
        Object []array=list.toArray();
        
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println();
    }
  
}
