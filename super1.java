//Using super keyword to access immediate parent class instance variables

class animal{
    String color = "White";
}

class dog extends animal{
    String color = "Black";
    void disp(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class super1 {
    public static void main (String args[]){
        dog obj1 = new dog();
        obj1.disp();
    }
}