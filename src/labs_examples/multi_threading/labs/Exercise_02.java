package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class PracticeExtendingThread extends Thread {
    private Thread thread;
    private String name;

    PracticeExtendingThread(String name) {
        thread = new Thread(this,name);
        this.name = name;
        thread.start();
    }

    private
    Thread getThread() {
        return thread;
    }

    private void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run(){
        System.out.println("First thread");
    }
}

class PracticeExtendingThreadClassDriver{
    public static void main(String[] args) {
        PracticeExtendingThread thrd1 = new PracticeExtendingThread("thrd1");
    }

}