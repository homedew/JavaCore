package Implement;

import java.io.*;

public class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream o) {
        os = o;
    }

    public void run() {
        int count = 1;
        while (true) {
            try {
                os.write(count);
                os.flush();

                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Producer:" + count);
            System.out.flush();
            count++;
        }
    }
}
