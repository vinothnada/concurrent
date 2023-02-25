package week3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread : "+Thread.currentThread().getName()+ " => Current state is :"+Thread.currentThread().getState());
        System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());

        Thread t1 = new MyThread("T1"); //Create instance of thread // 1t wiil enter the state called NEW
        System.out.println("Current state of t1 is :"+ t1.getState());

        Runnable r1 = new RunnableThread();
        Thread t2 = new Thread(r1, "R2"); // Runnable thread R1 enters New
        System.out.println("Current state of t2 is :"+ t2.getState());

        t1.start(); // at this pont t1 goes into runnable state
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(3);
        System.out.println("Current state of t1 is :"+ t1.getState());

        t2.start(); // at this pont r1 goes into runnable state
        System.out.println("Current state of t2 is :"+ t2.getState());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Current state of t1 is afterSleep:"+ t1.getState());
        System.out.println("Current state of t2 is afterSleep:"+ t2.getState());

    }
}
