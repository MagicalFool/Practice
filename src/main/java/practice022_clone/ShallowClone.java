package practice022_clone;

public class ShallowClone {

    public static void main(String[] args) throws CloneNotSupportedException {

        String str = new String("a");

        B b = new B();
        b.setI(1);
        b.setS("a");

        A a1 = new A();
        a1.setI(1);
        a1.setStr(str);
        a1.setB(b);

        A clone = (A) a1.clone();

        clone.setStr(new String("bbbb"));
        B b1 = new B();
        b1.setS("b");
        b1.setI(2);
//        clone.setB(b1);
        clone.setStr("b");
        clone.setI(2);
        b.setI(2);
        b.setS("bb");
    }

}


class A implements Cloneable {

    private int i;

    private String str;

    private B b;

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}

class B {
    private int i;

    private String s;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
