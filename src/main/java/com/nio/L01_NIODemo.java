package com.nio;

public class L01_NIODemo {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.b = b;
        b.a = a;
    }


}

class A{
    B b;
}
class B{
    A a;
}
