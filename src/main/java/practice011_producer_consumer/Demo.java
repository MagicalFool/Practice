package practice011_producer_consumer;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// res
class User{
    private String name;

    private String sex;

    public boolean flag = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

class Producer extends Thread{
    Lock lock = new ReentrantLock();
    User user;
    Producer(User user){
        this.user = user;
    }
    @Override
    public void run() {
        int num = 0;
        while (true){

            synchronized (user){
                if (user.flag){
                    try {
                        user.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (num == 0){
                    user.setName("小刘");
                    user.setSex("男");
                }else {
                    user.setName("小红");
                    user.setSex("女");
                }
                num = (num + 1) % 2;
                user.flag = true;
                user.notify();
            }


//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

class Consumer extends Thread{
    User user;
    Consumer(User user){
        this.user = user;
    }
    @Override
    public void run(){
        while (true){

            synchronized (user){
                if (!user.flag){
                    try {
                        user.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("name ="+user.getName()+","+ user.getSex());
                user.flag = false;
                user.notify();

            }




//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        User user = new User();
        Producer producer = new Producer(user);
        Consumer consumer = new Consumer(user);
        producer.start();
        consumer.start();
    }
}
