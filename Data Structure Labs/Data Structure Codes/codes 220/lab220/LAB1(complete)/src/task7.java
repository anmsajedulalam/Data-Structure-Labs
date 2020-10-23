import java.util.Scanner;
public class task7 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		int [] array=new int[10];
		System.out.println("Enter "+10+" numbers");
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		
		System.out.println("Which array cell do you choose?");
		int n=sc.nextInt();
		
		for(int i=1;i<=array[n];i++){
			System.out.print("*");
		}
	}
}
