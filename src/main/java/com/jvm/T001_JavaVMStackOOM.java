package com.jvm;

import com.sun.org.apache.xpath.internal.operations.String;

public class T001_JavaVMStackOOM {

    private void dontStop(){
        while (true){

        }
    }

    public void stackLeakByThread(){
        while (true){
            Thread th = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            th.start();
        }
    }

    public static void main(String[] args) {
        new T001_JavaVMStackOOM().stackLeakByThread();
    }
}
