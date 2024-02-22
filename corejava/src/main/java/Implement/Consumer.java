package Implement;
import java.io.*;

public class Consumer extends Thread {
    InputStream is;
    public Consumer(InputStream i) {
        is = i;
    }

    public void run() {
        int x;

        while(true)
        {
            try {
                x = is.read();
                System.out.println("Consumer: " + x);
                System.out.flush();
                Thread.sleep(2000);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           
        }
    }
}
