import java.util.Scanner;
public class task11 {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		String n=sc.nextLine();
		
		System.out.println(allDigitsOdd(n));
	}
	public static boolean allDigitsOdd(String num){
		char[] c=num.toCharArray();
		int x=c.length-1;
		int finDig=0;
		boolean b=true;
		for(int i=0;i<c.length;i++){
			int dig=Integer.parseInt(num.charAt(i)+"");
			if(dig%2==0){
				b=false;
				break;
			}
			x--;
		}
		return b;
	}
}
