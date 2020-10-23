import java.util.Scanner;
public class task9 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		int [] array =new int[10];
		
		System.out.println("Enter numbers");
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("Entered values :");
		display(array,10);
		square(array,10);
	}
	
	public static void display(int []array,int size){
		
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}
	}
	
	public static void square(int [] array,int size){
		for(int i=0;i<size;i++){
			array[i]=array[i]*array[i];
		}
		System.out.println("Squared values :");
		display(array,size);
	}
}
