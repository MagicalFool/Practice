package com.jvm;

/**
 * 该用例可以看出JVM的运行方式
 * @author chenchao
 */
public class T011_DemoJVM {
    public static void main(String[] args) {
        loadResource();
    }
    // 方法1
    public static void loadResource(){
        Resource resource = new Resource();
        resource.say();
    }
    static class Resource{
        public void say(){
            System.out.println("Hello");
        }
    }
}
