package Advanced;

public class InnerClass {
    public static void main(String[] args){
        A a = new A();
        a.show();

        A.B b = a.new B();
        b.config();
    }
}
