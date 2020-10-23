
package DrChamber;


import java.util.Scanner;
public class Tester {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        DrChamber dr=new DrChamber();
        while(true){
            System.out.println("1.Register Patient");
            System.out.println("2.Serve Patient");
            System.out.println("3.Cancel All");
            System.out.println("4.Can Doctor Go Home?");
            System.out.println("5.Show All Patient");
            System.out.println("6.Exit");
            System.out.println();
            System.out.println("Enter your choice");
            int n=sc.nextInt();
            System.out.println();
            
            if(n==1){
                
                dr.registerPatient();
            }else if(n==2){
                dr.servePatient();
            }else if(n==3){
                dr.cancelAll();
            }else if(n==4){
                dr.canDoctorGoHome();
            }else if(n==5){
                dr.showAllPatient();
            }else if(n==6){
                System.out.println("Thanks for using the software");
                break;
            }
    
        }
    }
}
