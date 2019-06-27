//To understand the concept of default constructor

class bike{
    int no;
    String name;
    bike(){ System.out.println("Bike " + name + " is created");}
}

public class defaultConstructor {
    public static void main (String args[]){
        bike b = new bike();
        b.name = "Dio";
        b.no = 4101;
    }
}