interface MyInterface {
    void show();
}

class Outer {
    class Inner {
        void display() {
            System.out.println("This is inner class.");
        }
    }

    void anonymousClassExample() {
        MyInterface obj = () -> System.out.println("This is anonymous class.");
        obj.show();
    }
}

public class TestInner {
    public static void main(String[] args) {       
        Outer outer = new Outer();
        
        Outer.Inner inner = outer.new Inner();
        inner.display();
        
        outer.anonymousClassExample();
    }
}
