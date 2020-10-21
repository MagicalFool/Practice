package com.jvm;

/**
 * 测试其长引用
 * JVM参数设置：-Xms10m -Xmx10m -Xmn8m  -XX:MaxTenuringThreshold=2
 */
public class T012_Demo2JVM {

    static ResourceManager resourceManager = new ResourceManager();

    public static void main(String[] args) throws InterruptedException {
             while (true){
                 loadResource();
                 Thread.sleep(500);
             }
    }

    public static void loadResource(){
        resourceManager.load();
    }
}

class ResourceManager{
    public void load(){
        System.out.println("加载资源。。。" + this);
    }
}