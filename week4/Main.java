package week4;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main Thread : "+Thread.currentThread().getName()+ " => Current state is :"+Thread.currentThread().getState());

        Thread t1 = new MyThread("T1"); //Create instance of thread // 1t wiil enter the state called NEW
        System.out.println("Current state of t1 is :"+ t1.getState());

        t1.start();
        System.out.println("Current state of t1 is :"+ t1.getState());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Current state of t1 is afterSleep:"+ t1.getState());

    }
}
