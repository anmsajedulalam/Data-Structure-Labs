

package recursion;

/**
 *
 * @author Fahim
 */
public class RecursiveSorting {
    static int [] array={2,4,1,8,5,3,7,6};
    static int min=0;
    public static void main(String [] args){
       int[] s=sort(min);
       
       for(int i=0;i<s.length;i++){
           array[i]=s[i];
           System.out.print(array[i]+" ");
       }
        System.out.println();
    }
    
    public static int[] sort(int i){
        if(i<array.length){
            sort(i+1);
        }
        for(int j=i+1;j<array.length;j++){
            if(array[i]>array[j]){
                int tmp=array[i];
                array[i]=array[j];
                array[j]=tmp;
            }
        }
        
        return array;
    }
}
