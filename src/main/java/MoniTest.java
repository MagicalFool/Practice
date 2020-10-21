import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MoniTest {


    static ExecutorService service = Executors.newFixedThreadPool(10);


    public static void main(String[] args) {

        List<List<Integer>> server = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List<Integer> sv = new ArrayList<>();
            for (int j = 0; j < 10000; j++) {
                sv.add(j);
            }
            server.add(sv);
        }

        for (int i = 0; i < 1; i++) {
            List<Integer> integers = server.get(i);
            List<Object> objects = Arrays.asList(integers.toArray());
            Iterator<Object> iterator = objects.iterator();
            int finalI = i;
//            synchronized (MoniTest.class) {
                service.execute(new Runnable() {
                    @Override
                    public void run() {
                        while (iterator.hasNext()) {
                            Integer next = (int) iterator.next();
                            if (next % 2 == 0) {
                                System.out.println("第i=" + finalI + "输出" + next);
                            }
                        }
                    }
                });
//            }
        }

    }
}
