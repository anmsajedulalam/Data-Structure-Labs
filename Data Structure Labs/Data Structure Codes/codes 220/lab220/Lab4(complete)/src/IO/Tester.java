

package IO;

import java.util.*;
import java.io.*;

public class Tester {
    public static void main(String[] args) {
        String location="\\src\\IO\\Book.txt";
        File f=new File(location);
        Scanner sint=new Scanner(System.in);
        BookRecord br=new BookRecord();
        
        try{
            Scanner sc=new Scanner(f);
        
            while(true){
            
            System.out.println("Enter 1 to Add a Record\n" +
                            "Enter 2 to Print the Records\n" +
                            "Enter 3 to Delete a Record\n" +
                            "Enter 4 to Edit a Record");
            int n=sint.nextInt();
            if(n==1){
                String s=sc.nextLine();
                StringTokenizer st=new StringTokenizer(s,",");
                String nm=st.nextToken();
                String i=st.nextToken();
                String a=st.nextToken();
                String p=st.nextToken();
                br.AddRecord(nm,i,a,p);
            }else if(n==2){
                br.PrintRecord();
            }else if(n==3){
                br.DeleteRecord();
            }else if(n==4){
                br.EditRecord();
            }
            
            System.out.println("Do you want to continue the program? If yes press 'y' else 'n'");
            String s=sint.next();
            
            if(s.equalsIgnoreCase("y")){
                
            }else{
                break;
            }
         }sc.close();
        }catch(FileNotFoundException e){
            System.out.println("No files found!!");
        }
    }
}
