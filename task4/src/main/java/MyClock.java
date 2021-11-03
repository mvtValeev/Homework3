
import java.util.concurrent.TimeUnit;

public class MyClock extends Thread {

    private  boolean isrunning = true;

    @Override
    public void run() {
        int a = 0;
        while (isrunning) {
            if (a == 0) {
                System.out.println("Tic");
                a = 1;
            }
            else{
                System.out.println("Tac");
                a = 0;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                isrunning = false;
        }
    }}
    public static void main(String[] args) {
        MyClock thread = new MyClock();
        thread.start();
        try {
            sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}