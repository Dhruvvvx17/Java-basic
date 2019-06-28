//Factorial of a number

public class factorial{
    public static void main(String args[]){
        int num = 5;
        int i = num,fact = 1;
        while(i != 0){
            fact = fact * i;
            i--;
        }
        System.out.println("Factorial of "+num+" is "+fact);    
    }
}