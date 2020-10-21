package practice012_concurrent_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// res
class User {
    private String name;

    private String sex;

    public Lock lock = new ReentrantLock();

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

class Producer extends Thread {
    User user;
    Condition condition;

    Producer(User user, Condition condition) {
        this.user = user;
        this.condition = condition;
    }

    @Override
    public void run() {
        int num = 0;
        while (true) {

            user.lock.lock();
            if (user.flag) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (num == 0) {
                user.setName("小刘");
                user.setSex("男");
            } else {
                user.setName("小红");
                user.setSex("女");
            }
            num = (num + 1) % 2;
//                user.lock.unlock();
            user.flag = true;
            condition.signal();

//                user.notify();

        }
    }
}

class Consumer extends Thread {
    User user;
    Condition condition;

    Consumer(User user, Condition condition) {
        this.user = user;
        this.condition = condition;
    }

    @Override
    public void run() {
        while (true) {
            user.lock.lock();
            if (!user.flag) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("name =" + user.getName() + "," + user.getSex());
//                user.lock.unlock();
            user.flag = false;
            condition.signal();
        }
    }
}

public class LockDemo {
    public static void main(String[] args) {
        User user = new User();
        Condition condition = user.lock.newCondition();
        Producer producer = new Producer(user, condition);
        Consumer consumer = new Consumer(user, condition);
        producer.start();
        consumer.start();
    }
}
