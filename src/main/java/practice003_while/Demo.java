package practice003_while;

public class Demo {
    public static void main(String[] args) {
        /**
         * while is limit to
         */
        int i = 0;
        while (true){
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
