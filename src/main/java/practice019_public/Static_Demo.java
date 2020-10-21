package practice019_public;

public class Static_Demo {
    static Result res = Result.result;

    public static void main(String[] args) {


        System.out.println(res.equals(res));

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    res.setI(i + 1000);
                    System.out.println(Thread.currentThread().getName() + "----" + res.getI());
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    res.setI(i + 2000);
                    System.out.println(Thread.currentThread().getName() + "-----------" + res.getI());
                }
            }
        }).start();
    }
}
