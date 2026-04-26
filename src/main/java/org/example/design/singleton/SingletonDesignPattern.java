package org.example.design.singleton;

class Singleton{

    private static Singleton instance;

    private Singleton(){
        //Not allowed
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

class ThreadSafeSingleton{

    private static volatile ThreadSafeSingleton instance;// we need volatile keyword to make sure that the instance variable is visible to all threads, because without volatile keyword, one thread may see the instance variable as null, while another thread may see it as not null, this can lead to multiple instances of the singleton class being created. nd volatile keyword also ensures that the instance variable is not cached by any thread, so that all threads see the most up-to-date value of the instance variable. And it maintains the order of operations, so that when one thread creates the instance, other threads will see the fully initialized instance, and not a partially initialized instance.

    private ThreadSafeSingleton(){
        //Not allowed
    }

    public static ThreadSafeSingleton getInstance(){
        //synchronized(ThreadSafeSingleton.class){//this is unneceessary lock, because may be the instance is already created, so we can check before locking
            if(instance == null){
                synchronized (ThreadSafeSingleton.class){//Suppose two threads are trying to access the getInstance method at the same time, both will check if instance is null, and both will find it null, then both will try to acquire lock on ThreadSafeSingleton class, but only one will acquire the lock and create the instance, the other will wait for the lock to be released, and when the lock is released, the second thread create one more object, so we need one more null check inside the synchronized block to avoid this problem, this is called double checked locking
                    if(instance == null) {
                        instance = new ThreadSafeSingleton();
                    }
                }
            }
            return instance;
        //}
    }
}




public class SingletonDesignPattern {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);

        //Testing thread safe singleton
        ThreadSafeSingleton threadSafeSingleton1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstance();
        System.out.println(threadSafeSingleton1==threadSafeSingleton2);
    }
}
