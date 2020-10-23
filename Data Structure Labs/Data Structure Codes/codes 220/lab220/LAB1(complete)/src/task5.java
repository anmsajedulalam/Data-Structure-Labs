import java.util.Scanner;
public class task5 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		int [] array=new int[10];
		System.out.println("Please enter number between 0 to 9");
		for(int i=0;i<15;i++){
			
			int n=sc.nextInt();
			array[n]++;
		}
		
		for(int i=0;i<array.length;i++){
			System.out.println(i+" was entered "+array[i]+" times.");
		}
	}
}
