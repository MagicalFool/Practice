package practice014_concurrent;

import java.util.HashMap;
import java.util.Map;

public class ThreadDemo extends Thread {

    private Map map;

    private int start;

    private int end;

    public ThreadDemo(Map map, int start, int end) {
        this.map = map;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            map.put(i, i + "_");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
