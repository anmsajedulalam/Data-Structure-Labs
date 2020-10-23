public class SelectionSortbyArray{
  
  public static void main(String[]args)
  {
    Object a[]={50,60,40,20,10,30};
   
    for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println();
    selectionSort(a);
    for(int i=0;i<a.length;i++)
    {
      System.out.print(a[i]+" ");
    }
    System.out.println();
  }

/**
 * Sort the specified array using selection sort.
 *
 * @param data the array containing the keys to sort
 */
public static void selectionSort(Object[] data) {
    for (int i = 0; i < data.length - 1; i++) {
        // Find the index of the minimum item, starting at `i'.
        int minIndex = i;
        for (int j = i + 1; j < data.length; j++) {
            if (((Comparable) data[j]).compareTo(data[minIndex]) < 0)
                minIndex = j;
        }

        // Exchange with the first item (at `i'), but only if different
        if (i != minIndex) {
            Object tmp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = tmp;
        }
    
  }
}

}