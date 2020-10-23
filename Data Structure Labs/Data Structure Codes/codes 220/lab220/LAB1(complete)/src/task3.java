import java.util.Scanner;

public class task3 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		int [] array=new int[5];
		System.out.println("Enter "+5+" numbers");
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					int m=array[i];
					array[i]=array[j];
					array[j]=m;
				}
			}
		}
		
		for(int i=0;i<array.length;i++){
			if(i==0){
				System.out.print(array[i]);
			}else{
				System.out.print(","+array[i]);
			}
		}
		
		for(int i=0;i<array.length;i++){
			if(array[i]%2==0){
				System.out.print(","+array[i]);
			}
		}
		
	}
}
