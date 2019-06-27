public class bubbleSort {

    static void bubblesort(int array[]){
        int n = array.length;
        int temp;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(array[j-1]>array[j]){
                    //swap
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
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
        bubblesort(array);
        System.out.print("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}