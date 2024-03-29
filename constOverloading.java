// To understand the concept of constructor overloading

class student {
    int id;
    String name;
    double gpa;

    student(int i, String n) {      //constructor-1 (with 2 param)
        id = i;
        name = n;
    }

    student(int i, String n, double g) {    // constructor-2 (with 3 param)
        id = i;
        name = n;
        gpa = g;
    }

    void display() {
        System.out.println("Name: " + name + " Id: " + id + " Gpa: " + gpa);
    }
}

public class constOverloading {
    public static void main(String args[]) {
        student s1 = new student(101, "Uday");
        student s2 = new student(281, "Dhruv", 8.86);
        s1.display();
        s2.display();
    }
}
//s1 gpa will be 0.0 as it is not assinged