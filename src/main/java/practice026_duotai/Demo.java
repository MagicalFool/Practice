package practice026_duotai;

public class Demo {

    public static void main(String[] args) {
        B b = new B();

        Parent parent = new B();
        // 不能向下转型  可以向上转型
//        B b1 = new Parent();
//
        A a = new A();

        InterfaceDemo interfaceDemo = new A();
    }
}
