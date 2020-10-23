

package Book;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BookRecord br=new BookRecord();
        
        
        while(true){
            
            System.out.println("Enter 1 to Add a Record\n" +
                            "Enter 2 to Print the Records\n" +
                            "Enter 3 to Delete a Record\n" +
                            "Enter 4 to Edit a Record");
            int n=sc.nextInt();
            if(n==1){
                br.AddRecord();
            }else if(n==2){
                br.PrintRecord();
            }else if(n==3){
                br.DeleteRecord();
            }else if(n==4){
                br.EditRecord();
            }
            
            System.out.println("Do you want to continue the program? If yes press 'y' else 'n'");
            String s=sc.next();
            
            if(s.equalsIgnoreCase("y")){
                
            }else{
                break;
            }
        }
    }

}

