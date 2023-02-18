package week3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread : "+Thread.currentThread().getName()+ " => Current state is :"+Thread.currentThread().getState());

        Thread t1 = new MyThread("T1"); //Create instance of mythread
        // 1t wiil enter the state called NEW
        System.out.println("Current state of t1 is :"+ t1.getState());

        t1.run();

    }
}
