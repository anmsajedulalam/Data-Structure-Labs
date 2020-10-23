import java.util.Scanner;
public class task2 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int [] array=new int[10];
		System.out.println("Enter "+10+" numbers");
		for(int i=0;i<array.length;i++){
			array[i]=sc.nextInt();
		}
		
		int maxVal=array[0];
		int maxPos=0;
		int minVal=array[0];
		int minPos=0;
		
		for(int i=1;i<array.length;i++){
			if(array[i]>maxVal){
				maxVal=array[i];
				maxPos=i;
			}else if(array[i]<minVal){
				minVal=array[i];
				minPos=i;
			}
		}
		
		array[maxPos]=minVal;
		array[minPos]=maxVal;
		
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}
