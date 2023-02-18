package week3;

public class MyThread extends Thread{

    public MyThread(String name){

    }

    @Override
    public void run() {
        for(int i = 0; i <10 ; i++){
            System.out.println(Thread.currentThread().getName()+" : "+ i);
        }
    }
}
