package com.zaurtregulov.multithreading;

public class Ex12 {
    static final Car car = new Car();
    static final Object lock = new Object();

    synchronized void mobileCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    synchronized void skypeCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    synchronized void whatsAppCall() {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsApp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements java.lang.Runnable {

    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunnableImplSkype implements java.lang.Runnable {

    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunnableImplWhatsApp implements java.lang.Runnable {

    @Override
    public void run() {
        new Ex12().whatsAppCall();
    }
}

class Car {

}

