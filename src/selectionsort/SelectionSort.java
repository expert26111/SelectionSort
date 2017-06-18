
package selectionsort;

/**
 *
 * @author Yoana Dandarova
 */
public class SelectionSort 
{

    public static void main(String[] args) 
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
      // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    void sort(int arr[])
    {
       int n = arr.length;
       for(int i = 0; i < n-1 ; i++)
       {
           int min_ind = i;
           for(int j = i+1 ; j< n; j++)
           {
               if(arr[j]  < arr[min_ind])
               {
                   min_ind = j;
               }
           }
               int temp = arr[min_ind];
               arr[min_ind] = arr[i];
               arr[i] = temp;
       }
    }
    
}
