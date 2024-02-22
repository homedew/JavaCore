package Implement;

import Inteface.IStreamingManager;
import java.io.*;


public class StreamingManager implements IStreamingManager {

    // #region File Manager
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
        // Explain that lower case from 97 - 122
        // upper case from 65 - 90
        // so 65 + 32 = 97 become lower
        if (origin >= 97 && origin <= 122)
            return origin - 32;
        return origin;
    }

    // #endregion

    // #region Byte Manager
    @Override
    public void ReadByteArray(byte[] data) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            int x;
            while ((x = bis.read()) != -1) {
                System.out.print((char) x);
            }

            bis.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void ReadByteArray2(byte[] data) {
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            String strData = new String(bis.readAllBytes());
            System.out.println(strData);
            System.out.println(bis.markSupported());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void WriteByteArray() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            bos.write('W');
            bos.write('A');
            bos.write('U');

            byte[] b = bos.toByteArray();
            String result = new String(b);

            for (byte x : b) {
                System.out.println((char) x);
            }

            FileOutputStream fos = new FileOutputStream("src/source/streamingfile3.txt");
            bos.writeTo(fos);
            System.out.print(result);

            bos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // #endregion

    // #region Char Manager
    @Override
    public void ReadCharArray(char[] data) {
        try {
            CharArrayReader chr = new CharArrayReader(data);
            int x;
            while ((x = chr.read()) != -1) {
                System.out.println((char) x);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    // #endregion

    // #region Buffer Manager
    @Override
    public void BufferInputStream() {
        try {
            FileInputStream fis = new FileInputStream("src/source/streamingfileCopy2.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            String result = new String(bis.readAllBytes());

            System.out.print(result);
            bis.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void BufferWithMark() {
        try {
            FileInputStream fis = new FileInputStream("src/source/streamingfileCopy2.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());

            bis.mark(3);
            System.out.println((char) bis.read());

            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());

            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());

            bis.reset();
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // #endregion

    // #region RandomAccessFile
    @Override
    public void RandomAccessFileFunc() {
        try {
            RandomAccessFile raf = new RandomAccessFile("src/source/streamingfileCopy2.txt", "rw");
            System.out.println((char) raf.read());
            System.out.println((char) raf.read());
            System.out.println((char) raf.read());
            raf.write('b');
            raf.write('l');
            System.out.println((char) raf.read());
            raf.skipBytes(3);
            System.out.println((char) raf.read());
            raf.seek((3));
            System.out.println((char) raf.read());
            System.out.println(raf.getFilePointer());
            raf.seek(raf.getFilePointer() + 2);
            System.out.println((char) raf.read());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // #endregion

    // #region Read a File
    @Override
    public void ReadAFile() {
        File f = new File("src");
        System.out.println(f.isDirectory());

        String file[] = f.list();
        for (String t : file) {
            System.out.println(t);
        }

        File file2[] = f.listFiles();
        for (File fi : file2) {
            System.out.println(fi.getName());
            System.out.println(fi.getPath());

        }

    }

    /**
     * InnerStreamingManager
     */
  

    // #region PrintStreamF
    @Override
    public void PrintStreamFunc() {
        try (FileOutputStream fos = new FileOutputStream("src/source/studentfile.txt")) {

            PrintStream ps = new PrintStream(fos);
            Student student = new Student();
            student.age = 10;
            student.name = "Test";

            ps.println(student.age);
            ps.println(student.name);

            ps.close();
            fos.close();

            FileInputStream fis = new FileInputStream("src/source/studentfile.txt");
            BufferedReader r = new BufferedReader(new InputStreamReader(fis));

            Student s = new Student();
            s.age = Integer.parseInt(r.readLine());
            s.name = r.readLine();

            System.out.println(s.age);
            System.out.println(s.name);
            
            fis.close();
            r.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // #endregion


    // #region DataInputStreamFunc
    @Override
    public void DataInputStreamFunc() {
        try (FileInputStream fis = new FileInputStream("src/source/studentfile.txt")) {
            DataInputStream dis = new DataInputStream(fis);

            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            fis.close();
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // #endregion


    @Override
    public void ObjectInputStreamFunc() {

        try {
            FileOutputStream fos = new FileOutputStream("src/source/studentfile2.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Student s = new Student();
            s.age = 10;
            s.name = "ABC";
            oos.writeObject(s);
            fos.close();
            oos.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        

        try (FileInputStream fis = new FileInputStream("src/source/studentfile2.txt")) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s = new Student();

            s = (Student)ois.readObject();
            System.out.println(s.toString());

            fis.close();
            ois.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
