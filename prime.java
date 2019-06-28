//Java program to check if the given number is prime or not

public class prime{
    public static void main(String args[]){
        int num = 11;   //number to be checked
        int i, flag = 1;
        if(num == 0 || num == 1){
            System.out.println(num + " is not prime");
        }
        else{
            for(i = 2;i< num/2;i++){
                if(num % i == 0){
                    System.out.println(num + " is not prime");
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
                System.out.println(num + " is prime");            
        }
    }
}