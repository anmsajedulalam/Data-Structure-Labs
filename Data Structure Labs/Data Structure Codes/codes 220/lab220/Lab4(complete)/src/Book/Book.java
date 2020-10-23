

package Book;

import java.util.Scanner;
public class Book {
    Scanner sc=new Scanner(System.in);
    String Name;
    String Id;
    String Author;
    String Publisher;
    
    public Book(){
        System.out.println("Enter your name");
        Name=sc.nextLine();
        System.out.println("Enter your ID");
        Id=sc.nextLine();
        System.out.println("Enter Author's name");
        Author=sc.nextLine();
        System.out.println("Enter Publisher");
        Publisher=sc.nextLine();
    }
}
