import java.util.Scanner;
public class task6 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers do want to input?");
		int n=sc.nextInt();
		int j=0;
		int [] array=new int[n];
		System.out.println("Enter numbers");
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<array.length;i++){
			if(array[i]==array[n-1-i]){
				j++;

			}else{
				System.out.println("not palindrome");
				break;
			}
		}
		if(j==array.length){
			System.out.println("palindrome");
		}
		
	}
}
