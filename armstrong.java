//java program to find if a number is an armstrong number or not.
//armstrong number - when the sum of cube of every digit = the number itself 

public class armstrong{
    public static void main(String args[]) {
        int num = 153;
        int temp = num,a,c = 0;
        while(temp > 0){
            a = temp%10;
            c = (a*a*a)+c;
            temp = temp/10;
        }
        if(num == c)
            System.out.println(num+" is an armstrong number");
        else
            System.out.println(num + " is not an armstrong number");
    }
}