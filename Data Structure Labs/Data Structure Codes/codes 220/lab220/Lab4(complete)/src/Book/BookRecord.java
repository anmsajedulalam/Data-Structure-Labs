

package Book;

import java.util.Scanner;
public class BookRecord {
    Scanner sc=new Scanner(System.in);
    Book BookArray[]=new Book[10];
    int size=0;
    public void AddRecord(){
        if(size==BookArray.length){
            Book []temp=new Book[BookArray.length+5];
            for(int i=0;i<BookArray.length;i++){
                temp[i]=BookArray[i];
            }
            BookArray=temp;
        }
        
        BookArray[size]=new Book();
        size++;
    }
    
    public void PrintRecord(){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(BookArray[i].Name.compareTo(BookArray[j].Name)>0){
                    Book temp=BookArray[i];
                    BookArray[i]=BookArray[j];
                    BookArray[j]=temp;
                }else if(BookArray[i].Name.compareTo(BookArray[j].Name)==0){
                    if(BookArray[i].Id.compareTo(BookArray[j].Id)>0){
                        Book temp=BookArray[i];
                        BookArray[i]=BookArray[j];
                        BookArray[j]=temp;
                    }
                }
            }
        }
        
        for(int i=0;i<size;i++){
            System.out.println("Name: "+BookArray[i].Name);
            System.out.println("Id: "+BookArray[i].Id);
            System.out.println("Author: "+BookArray[i].Author);
            System.out.println("Publisher: "+BookArray[i].Publisher);
        }
    }
    
    public void DeleteRecord(){
        System.out.println("Enter the Id you want to delete:");
        String del=sc.nextLine();
        
        for(int i=0;i<size;i++){
            int n=0;
            if(BookArray[i].Id.equals(del)){
                for(n=i+1;n<size;n++){
                    BookArray[n-1]=BookArray[n];
                }
                size--;
                System.out.println("ID: "+del+" has successfully been deleted");
                break;  
            }else if(i==size-1){
                System.out.println("ID: "+del+" was not found");
            }
        }
   }
    
    public void EditRecord(){
        System.out.println("Enter the Id of the record you want to edit:");
        String ed=sc.nextLine();
        
        for(int i=0;i<size;i++){
            if(BookArray[i].Id.equals(ed)){
                System.out.println("Enter new name");
                String n=sc.nextLine();
                BookArray[i].Name=n;
                
                System.out.println("Enter new id");
                String id=sc.nextLine();
                BookArray[i].Id=id;
                
                System.out.println("Enter new author");
                String a=sc.nextLine();
                BookArray[i].Author=a;
                
                System.out.println("Enter new Publisher");
                String p=sc.nextLine();
                BookArray[i].Publisher=p;
                
                System.out.println("Profile Updated!");
                break;
            }else if(i==size-1){
                System.out.println("ID "+ed+" was not found.");
            }
        }
    }
}
