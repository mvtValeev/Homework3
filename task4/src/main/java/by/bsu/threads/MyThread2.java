package by.bsu.threads;

public class MyThread2 extends Thread{
    @Override
    public void run()
    {
        System.out.println("This is extended thread");
        for (int i = 0; i < 10; i++){
            System.out.print("");
        }
    }
    public static void main(String[] args) {
        Thread thread = new MyThread2();
        thread.start();
    }
}
