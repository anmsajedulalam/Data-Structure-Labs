public class Test{
  public static int [] removeOdd (int [] input){
	int []temp=new int[input.length];
	int b=0;
	
	for(int i=0;i<input.length;i++){
		if(input[i]%2==0){
			temp[b]=input[i];
			b++;
		}
	}
	return temp;
  }
  public static void main(String [] args){
    int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
    for (int i = 0; i < mixedArray.length; i++) {
      System.out.print(mixedArray[i] + " ");
    }
    System.out.println();
    int [] noOdd = removeOdd(mixedArray);
    for (int i = 0; i < noOdd.length; i++) {
    	if(noOdd[i]==0)
        {
          break;
        }
      System.out.print(noOdd[i] + " ");
    }    
  }
}
