//To generate fibonacci series for a given number of terms 

class fib{
    public static void main(String args[]){
        int a = 0, b = 1, n = 10, i = 2, c;
        System.out.print("Fibonacci series: ");        
        while(i<=n){
            System.out.print(a + " ");
            c = b;
            b = a + b;
            a = c;
            i++;
        }
        System.out.println("\n");
    }
}