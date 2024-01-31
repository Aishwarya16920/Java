package Package2;

import Package1.*;

public class ASub extends B {
    public static void main(String[] args){
        C c = new C();
        System.out.println(c.defaultMessage);

        ASub aSub = new ASub();
        System.out.println(aSub.protectedMessage);
    }
}
