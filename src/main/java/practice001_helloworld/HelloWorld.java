package practice001_helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world!!!");
        int b = 1;
        System.out.print("%s,aaa");

        // string intern
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);
        String s3 = new String("1") + new String("1");
//        s3.intern();
        String s4 = "11";

        System.out.println(s3 == s4);
    }
}
