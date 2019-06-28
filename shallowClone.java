/*To use object.clone() method -
    step1:  implement "Cloneable"
    step2:  define clone() method
    step3:  handle CloneNotSupportedException
    step4:  call object.clone() method
*/

class test{
    int x,y;
}

class clone1 implements Cloneable{      // step1
    int a;
    int b;
    test c = new test();

    public Object clone() throws CloneNotSupportedException{    //step2 + 3
        return super.clone();
    }
}

public class shallowClone {
    public static void main (String args[]) throws CloneNotSupportedException{
        clone1 t1 = new clone1();
        t1.a = 10;
        t1.b = 20;
        t1.c.x = 30;
        t1.c.y = 40;

        clone1 t2 = (clone1) t1.clone();        //step4
        t2.a = 100;     //change in primitive field will not be reflected in t1
        t2.c.x = 300;   //change in an object type field will be reflected in both t1 and t2

        System.out.println(t1.a + " " + t1.b + " " + t1.c.x + " " + t1.c.y);
        System.out.println(t2.a + " " + t2.b + " " + t2.c.x + " " + t2.c.y);
    }
}