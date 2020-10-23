

package DrChamber;

public class Patient {
    int id=0;
    String name="";
    
    
    public Patient(int i,String n){
        id=i;
        name=n;
    }
    
    public String toString(){
        return "Name: "+name+"\nId: "+id;
    }
}
