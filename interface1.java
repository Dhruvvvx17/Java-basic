interface drawable{
    void draw();        //compiler changes it to:   public static void draw();
}

class circle implements drawable{
    public void draw(){     //need to implement it as a public method, cannot reduce its visibility
        System.out.println("Drawing circle");
    }
}

class square implements drawable{
    public void draw(){     //need to implement it as a public method, cannot reduce its visibility
        System.out.println("Drawing rectangle");
    }
}

public class interface1 {
    public static void main (String args[]){
        drawable obj1 = new circle();
        obj1.draw();
        drawable obj2 = new square();
        obj2.draw();
    }
}