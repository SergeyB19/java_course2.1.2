package com.zaurtregulov.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Zaur", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        Thread.sleep(5000);
        new Employee("Viktor", lock);
        new Employee("Marina", lock);
    }
}

class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {

      /*  System.out.println(name + " ждет... ");
        lock.lock();*/
            try {
                Thread.sleep(2000);
                System.out.println(name + " завершил(а) свои дела");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
            System.out.println(name + " пользуется банкоматом");
        } else {
            System.out.println(name + " не хочет ждать в очереди ");
        }
    }
}
