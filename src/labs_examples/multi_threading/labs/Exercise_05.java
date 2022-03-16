package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

class Example_05 implements Runnable {
    public Thread thread;
    private String name;

    public Example_05(String name){
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

class Example_05Runnable2Class implements Runnable{
    public Thread thread;
    private String name;

    public Example_05Runnable2Class(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void receive(){
        try {
            wait(2000);
            System.out.println("Thread " + getName() + "is running");
        } catch (InterruptedException exc) {
            System.out.println("An error has occurred" + exc.getMessage());
            exc.printStackTrace();
        }

    }

    public synchronized void send() {
            try {
                wait(1000);
            } catch (InterruptedException exc) {
                System.out.println("An error has occurred" + exc.getMessage());
                exc.printStackTrace();
            }
            notify();
        }

    public void run() {
        send();
        receive();
    }
}

class Example_05DriverClass {
    public static void main(String[] args) {
        Example_05 runnable1 = new Example_05("thread3");

        new Thread(new Example_05Runnable2Class("thread4"), "Option 5").start();
        new Thread(new Example_05Runnable2Class("thread5"), "Option 6").start();

        runnable1.thread.setPriority(Thread.MAX_PRIORITY);

        runnable1.thread.start();



    }
}
