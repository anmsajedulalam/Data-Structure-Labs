import java.util.Scanner;
public class task8 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What will be the size of the matrices?");
		int size=sc.nextInt();
		
		int []A=new int[size];
		int []B=new int[size];
		
		int modA;
		System.out.println("Enter the values of first matrix");
		for(int i=0;i<A.length;i++){
			A[i]=sc.nextInt();
		}
		
		System.out.println("Enter the values of second matrix");
		for(int i=0;i<B.length;i++){
			B[i]=sc.nextInt();
		}
		
		int []C=new int[size];
		
		for(int i=0;i<C.length;i++){
			C[i]=5*A[i]-B[i];
			System.out.print(C[i]+" ");
		}
		
	}
}
