package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class FirstRunnableInterface implements Runnable {
    public Thread thread;
    private String name;

    public FirstRunnableInterface(String name){
        thread = new Thread(this, name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + thread.getName() + "is running. Hello new world!");
    }

}

class SecondRunnableInterface implements Runnable{
    public Thread thread;
    private String name;

    public SecondRunnableInterface(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Thread " + getName() + "is running");
    }
}

class RunnableInterfaceDriver{
    public static void main(String[] args) {
        FirstRunnableInterface runnable1 = new FirstRunnableInterface("thread1"); // thread initiated in constructor

        SecondRunnableInterface runnable2;
        new Thread(new Example_05Runnable2Class("thread2"), "Option 3").start(); // thread initiated here

        runnable1.thread.setPriority(Thread.MAX_PRIORITY); // exercise 3 change a thread's priority

        runnable1.thread.start();



    }
}


