package com.acciojob.Hospital_Management_System1.Multithreading;
class MyThread2 extends Thread{
    public void run(){
        while (1 > 0){
            System.out.println("I am in Second thread");
        }
    }
}
class MyThread3 implements Runnable{
    public void run(){
        System.out.println("Sleeping a thread in 10 seconds");

        while (1>0){
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread woke up");

            System.out.println("Implementing using an interface");
        }
    }
}
class MyThread extends Thread{
    public void run(){
        //This run method is ascting like a main method

        while (1>0){
            System.out.println("I am inside My thread execution");
        }
    }
}

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
//        MyThread thread = new MyThread();
//        thread.start();
//
//        MyThread2 thread2 = new MyThread2();
//        thread2.start();

        Thread thread3 = new Thread(new MyThread3());
        thread3.start();

        thread3.isAlive();//living or dead

        thread3.join();//killing a thread


//        while (1>0){
//            System.out.println("I am in the main thread class ");
//        }
    }
}
