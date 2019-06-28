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
//default constructor is invoked automatically when object is create
//output is "Bike null is created" as name is not assigned any value when default constructor is called