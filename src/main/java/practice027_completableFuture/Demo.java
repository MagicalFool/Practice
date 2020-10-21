package practice027_completableFuture;

import java.util.*;
import java.util.concurrent.*;

public class Demo {

    static final ExecutorService threadPool = new ThreadPoolExecutor(2,2,100, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10));

    public static void main(String[] args) {
        CompletableFuture completableFuture = CompletableFuture.supplyAsync(()->{
            System.out.println("hello");
//            return i;
            return 1;
        },threadPool);


    }

}
