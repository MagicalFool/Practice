package com.jvm;

/**
 *
 * -XX:+PrintGCDetails  打印gc日志
 * -XX:SurvivorRatio=8  它定义了新生代中Eden区域和Survivor区域（From幸存区或To幸存区）的比例，默认为8 就是8:1:1
 * -XX:MaxTenuringThreshold= 15 -XX:MaxTenuringThreshold设置的是年龄阈值，默认15（对象被复制的次数）
 * -Xms40M -Xms 堆内存的最小大小，默认为物理内存的1/64
 * -Xmx40M -Xmx 堆内存的最大大小，默认为物理内存的1/4
 * -Xmn20M -Xmn 堆内新生代的大小。通过这个值也可以得到老生代的大小：-Xmx减去-Xmn
 * @author chenchao
 */
public class T010_TestHeapGC {

    public static void main(String[] args) {
        byte[] b1 = new byte[1024 * 1024 /2 ];
        byte[] b2 = new byte[1024 * 1024 * 8 ];
        b2 = null;
        b2 = new byte[1024 * 1024 * 8]; // 进行一次年轻代GC
        System.gc();

    }
}
