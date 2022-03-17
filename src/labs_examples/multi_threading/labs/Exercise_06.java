package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class Example_06RunnableClass1 implements Runnable {
    public Thread thread;
    private String name;

    public int PRINT_NUMBERS_UPTO=100;
    static int  number=1;
    int remainder;
    static Object lock=new Object();

    Example_06RunnableClass1(int remainder,String name)
    {
        thread = new Thread(this, name);
        this.name = name;
        this.remainder=remainder;
        thread.start();
    }

    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO-1) {
            synchronized (lock) {
                while (number % 3 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();

                // comment
            }
        }
    }
}

class Example_06DriverClass {
    public static void main(String[] args) {
        Example_06RunnableClass1 runnable3 = new Example_06RunnableClass1(1, "thread 1");
        Example_06RunnableClass1 runnable4 = new Example_06RunnableClass1(2,"thread 2");
        Example_06RunnableClass1 runnable5 = new Example_06RunnableClass1(0,"thread 3");

    }
}