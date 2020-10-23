public class BinarySearch
{
  public static void main(String[]args)
  {
    Object data[]={10,20,30,40,50,60,70,80,90,100};
    System.out.println(binSearch(data,10,70));
  }
/**
 * Searches for the given key in the array of size elements.
 * Pre-condition: data must be sorted in non-decreasing order.
 *
 * @param data the array with the keys
 * @param size the number of keys in the array (? data.length)
 * @param key  the key to search for in the array
 * @return the position of the key if found, or -1 otherwise.
 */
public static int binSearch(Object[] data, int size, Object key) {
    int l = 0;
    int r = size - 1;
    while (l <= r) {
        int mid = (l + r)/2;
        if (key.equals(data[mid]))
            return mid;             // return index of item if found
        else if (((Comparable) key).compareTo(data[mid]) > 0)
            l = mid + 1;
        else
            r = mid - 1;
    }
    return -1;                      // return sentinel if not found
 }
}

