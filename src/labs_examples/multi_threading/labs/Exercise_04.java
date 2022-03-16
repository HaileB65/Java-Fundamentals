package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

class Example_04ExtendingThreadPractice extends Thread {
    private Thread thread;
    Sender sender;
    private String msg;


    public Example_04ExtendingThreadPractice(String m, Sender obj) {
            msg = m;
            sender = obj;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run(){
        synchronized(sender)
        {
            sender.send(msg);
        }
    }

}
class Sender {
    public void send(String msg) {
        System.out.println("Sending\t" + msg );
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}


class Example_04Driver {
    public static void main(String[] args) {
        Sender snd = new Sender();
        Example_04ExtendingThreadPractice s1 = new Example_04ExtendingThreadPractice( " Hi " , snd );
        s1.start();
    }

}