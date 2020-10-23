import java.util.Scanner;
public class task4 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		int [] array=new int[10];
		System.out.println("Enter "+10+" numbers");
		
		array[0]=sc.nextInt();
		
		for(int i=1;i<array.length;i++){
			array[i]=sc.nextInt();
			for(int j=0;j<i;j++){
				if(array[i]==array[j]){
					System.out.println(array[i]+" is already in among the entered numbers. Please enter different number");
					i--;
				}
			}
		}
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
		
	}
}
