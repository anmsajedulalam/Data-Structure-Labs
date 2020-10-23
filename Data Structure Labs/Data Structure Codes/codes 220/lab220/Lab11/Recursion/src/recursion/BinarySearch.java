

package recursion;

public class BinarySearch {
    static int []array={0,10,20,30,40,50,60,70,80,90};
    static int left=0;
    static int right =array.length-1;
    public static void main(String [] args){
          System.out.println(binarySearch(left,right,0));
    }
    
    public static int binarySearch(int left,int right,int n) {
        int mid=(left+right)/2;
        if(array[mid]==n){
           return  mid;
        }else if(array[mid]>n){
            return binarySearch(left,mid-1,n);
        }else{
            return binarySearch(mid+1,right,n);
        }
    }
}
