import java.util.Scanner;

public class task10 {
	public static void main(String [] args){
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter month");
		 int m=sc.nextInt();
		 System.out.println("Enter day");
		 int d=sc.nextInt();
		 
		 System.out.println(season(m,d));
		 
		
	} 
	public static String season(int month,int day){
		String s="";
		if(month<3||(month==3&&day<=15) ||(month==12&&day>15)){
			s="Winter";
		}else if(month<6 ||(month==6&&day<=15)||(month==3&&day>15)){
			s="Spring";
		}else if(month<9||(month==9&&day<=15)||(month==6&&day>15)){
			s="Summer";
		}else if(month<12||(month==12&&day<=15)||(month==9&&day>15)){
			s="Fall";
		}
		return s;
	}
}
