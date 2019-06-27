public class selectionSort {

    static void selectionsort(int array[]){
        int n = array.length;
        int temp,min;
        for(int i=0;i<n-1;i++){
            min = i;
            for(int j=i;j<n;j++){
                if(array[j]<array[min]){
                    min = j;
                }
                //swap
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
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
        selectionsort(array);
        System.out.print("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}