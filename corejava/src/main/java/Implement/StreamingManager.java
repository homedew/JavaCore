package Implement;

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
    public void WriteIntoFile(String fileData, int offset, int length) {
        try {
            FileOutputStream fos = new FileOutputStream("src/source/streamingfile2.txt");
            byte[] byteData = fileData.getBytes();
            fos.write(byteData, offset, length);
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public void ReadFile(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            byte[] fileData = new byte[fis.available()];
            fis.read(fileData);

            String data = new String(fileData);
            System.out.println(data);
            fis.close();

        } catch (Exception e) {
            System.out.println("Bro this file not found man. Check your code");
        }
    }

    @Override
    public void ReadFileWithWhile(String filePath) {
        try {
            FileInputStream fis = new FileInputStream(filePath);
            int charx = 0;
            // if charx == -1 meaning that the EOF
            while ((charx = fis.read()) != -1) {
                System.out.print((char) charx);
            }
        } catch (Exception e) {
            System.out.println("Bro this file not found man. Check your code");
        }
    }

    @Override
    public void ReadFileWithFileReader(String filePath) {
        try {
            FileReader fr = new FileReader(filePath);
            int charx = 0;

            while ((charx = fr.read()) != -1) {
                System.out.print((char) charx);
            }

        } catch (Exception e) {
            System.out.println("God damn. Tonight a god from neibourhood park as a fking damn dog");

        }
    }

    @Override
    public void CopyFile(String sourcePath, String destinationPath) {
        // we use these previous function but for new language better do it again for
        // remember
        try {
            // read file sourcePath
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destinationPath);

            int converToUpperCase;
            while ((converToUpperCase = fis.read()) != -1) {
                converToUpperCase = ConvertAllToUpperCase(converToUpperCase);
                fos.write(converToUpperCase);
            }
            fis.close();

            fos.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Really? File not found.");
        } catch (Exception e) {
            System.out.println("Emotional damage. See what u done man?");
        }
    }

    @Override
    public int ConvertAllToUpperCase(int origin) {
        //Explain that lower case from 97 - 122
        // upper case from 65 - 90
        //so 65 +  32 = 97 become lower
        if (origin >= 97 && origin <= 122)
            return origin - 32;
        return origin;
    }

}
