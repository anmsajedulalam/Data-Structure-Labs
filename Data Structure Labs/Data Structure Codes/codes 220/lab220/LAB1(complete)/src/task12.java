import java.util.Scanner;

import javax.jws.soap.SOAPBinding;
public class task12 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter month");
		int m1=sc.nextInt();
		System.out.println("Enter day");
		int d1=sc.nextInt();
		System.out.println("Enter another month");
		int m2=sc.nextInt();
		System.out.println("Enter another month");
		int d2=sc.nextInt();
		
		System.out.println(before(m1,d1,m2,d2));
	}
	public static boolean before(int m1,int d1,int m2,int d2){
		boolean b=false;
		if(m1<m2||(m1==m2&&d1<d2)){
			b=true;
		}
		return b;
	}
}
