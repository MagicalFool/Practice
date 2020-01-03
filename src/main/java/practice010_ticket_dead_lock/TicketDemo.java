package practice010_ticket_dead_lock;

public class TicketDemo implements Runnable {

    private int count = 100;

    public void run() {
        while (count >0){
            sale();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void sale(){
        if (count <= 0){return;}

        System.out.println("线程:"+Thread.currentThread().getName() +",票号" + count);

        count -- ;
    }

    public static void main(String[] args) {
        TicketDemo demo = new TicketDemo();
        Thread t1 = new Thread(demo);
        Thread t2 = new Thread(demo);
        t1.start();
        t2.start();
    }
}
