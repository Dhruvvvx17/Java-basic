// Way to implement copy constructor - 2 without using constructor overloading in driver program

class student {
    int id;
    String name;

    student(int i, String n) {
        id = i;
        name = n;
    }

    student() {}        //default constructor - init student objects with id = 0 ; name = "null"

    void display() {
        System.out.println("Name: " + name + " Id: " + id);
    }
}

public class copy2 {
    public static void main(String args[]) {
        student s1 = new student(281, "Dhruv");
        student s2 = new student();         // s2 created as default
        s2.id = s1.id;
        s2.name = s1.name;                  //s1's properties copied to s2
        s1.display();
        s2.display();
    }
}