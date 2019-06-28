/*To use object.clone() method -
    step1:  implement "Cloneable"
    step2:  define clone() method
    step3:  handle CloneNotSupportedException
    step4:  call object.clone() method
*/

class test {
    int x, y;
}

class clone2 implements Cloneable { // step1
    int a;
    int b;
    test c = new test();

    public Object clone() throws CloneNotSupportedException { // step2 + 3
        clone2 t2 = (clone2) super.clone();         //assign shallow copy to t2 reference variable
        t2.c = new test();                    //create new object for field c and assign it to the reference variable. This makes is a deep copy as now both primitive data types and objects do not correspond to the same memory location.
        return t2;
    }
}

public class deepClone {
    public static void main(String args[]) throws CloneNotSupportedException {
        clone2 t1 = new clone2();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;

        clone2 t2 = (clone2) t1.clone(); // step4
        t2.a = 100; // change in primitive field will not be reflected in t1
        t2.c.x = 300; // change in an object type field will be reflected in both t1 and t2

        System.out.println(t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
        System.out.println(t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);
    }
}

//output:
//10 20 30 40
//100 20 300 0
// 0 because it is deep copy of the object test and does not have any value explicitly assigned