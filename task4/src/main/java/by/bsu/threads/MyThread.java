package by.bsu.threads;
class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("This is runnable thread");
        for (int i = 0; i < 10; i++) {
            System.out.print("");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.run();
    }
}
