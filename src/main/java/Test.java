public class Test {

    public static void main(String[] args) {
        Integer a = 1000, b = 1000;
        Integer c = 100, d = 100;
        System.out.println("Integer a = 1000,b = 1000;" + (a == b));
        System.out.println("Integer c = 100,d = 100;" + (c == d));

        Obj[] array = new Obj[3];
        new Obj();


//        System.out.println(a.equals(b));
//        System.out.println(c.equals(d));
    }
}

class Obj {
    static {
        System.out.println("我被初始化了");
    }

    public Obj() {
        System.out.println("我被构造了");
    }
}
