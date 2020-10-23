import java.util.Scanner;
public class task1 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers do want to input?");
		int n=sc.nextInt();
		
		int [] array=new int[n];
		System.out.println("Enter numbers");
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<array.length;i++){
			if(array[0]==6||array[n-1]==6){
				System.out.println("true");
				break;
			}else{
				System.out.println("false");
				break;
			}
		}
	}
}
