//Insertion sort

public class insertionSort {

    static void insertionsort(int array[]){
        int n = array.length;
        int k,c;
        
        for(int i=1;i<n;i++){
            k = i-1;
            c = array[i];
            while(k>=0 && array[k]>c){
                array[k+1] = array[k];
                k--;
            }
            array[k+1] = c;
            }
        }
    public static void main (String args[]){
        int array[] = {4,2,7,1,5,3,10,9,8,6};
        int n = array.length;
        System.out.println("\n");
        System.out.print("Array before sorting: ");
        for(int i = 0 ;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");
        insertionsort(array);
        System.out.print("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}