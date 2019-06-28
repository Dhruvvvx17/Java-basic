//Binary search

public class binarySearch {

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

    static void binarysearch(int array[],int first,int last,int ele) {
        int mid = (first+last)/2;
        while(first<=last){
            if(array[mid] == ele){
                System.out.println("Element " + ele + " found at " + mid);
                break;
            }
            else if(array[mid] < ele)
                first = mid + 1;
            else
                last = mid - 1;
            
            mid = (first + last) / 2;
        }
        if(first>last)
            System.out.println("Element " + ele + " not found");
    }

    public static void main(String args[]) {
        int array[] = { 4, 2, 7, 1, 5, 3, 10, 9, 8, 6 };
        int n = array.length;
        int ele = 9;
        insertionsort(array);
        System.out.println("\n");
        System.out.print("Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        binarysearch(array,0,n-1,ele);
    }
}