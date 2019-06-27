public class linearSearch {
    static int linearsearch(int array[], int ele){
        int n = array.length;            
        for(int i=0;i<n;i++){
            if(array[i] == ele)
                return i;
        }
        return -1;
    }
    public static void main (String args[]){
        int array[] = {4,2,7,1,5,3,10,9,8,6};
        int n = array.length;    
        int ele = 12;
        System.out.println("\n");
        System.out.print("Array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        int index = linearsearch(array,ele);
        if(index == -1)
            System.out.println("Element " + ele + " not found");
        else
            System.out.println("Element " + ele + " found at " + index);
    }
}