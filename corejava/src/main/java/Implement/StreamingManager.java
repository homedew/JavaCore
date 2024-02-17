package Implement;
import java.io.FileNotFoundException;
import Inteface.IStreamingManager;
import java.io.*;
public class StreamingManager implements IStreamingManager {

    @Override
    public void WriteIntoFile(String fileData) {
        try {
            FileOutputStream fos = new FileOutputStream("src/source/streamingfile1.txt");
            fos.write(fileData.getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Please check the file now");
        }
    }

    @Override
    public void WriteIntoFile(String fileData, int offset, int length)
    {
        try {
            FileOutputStream fos = new FileOutputStream("src/source/streamingfile2.txt");
            byte[] byteData = fileData.getBytes();
            fos.write(byteData, offset, length);
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }

}
