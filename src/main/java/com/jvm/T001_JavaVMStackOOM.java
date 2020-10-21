package com.jvm;

public class T001_JavaVMStackOOM {

    public static void main(String[] args) {
        new T001_JavaVMStackOOM().stackLeakByThread();
    }

    private Integer count = 1;

    private void dontStop() {
        count++;
        dontStop();
    }

    public void stackLeakByThread() {
        try {
            dontStop();
        } catch (Throwable e) {
            System.out.println("count --> " + count);
//            e.printStackTrace();
        }

    }


}
