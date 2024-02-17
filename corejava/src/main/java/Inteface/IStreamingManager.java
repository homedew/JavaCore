package Inteface;

public interface IStreamingManager {
    void WriteIntoFile(String fileData);
    void WriteIntoFile(String fileData, int offset, int length);
    void ReadFile(String filePath);
    void ReadFileWithWhile(String filePath);
    void ReadFileWithFileReader(String filePath);
    void CopyFile(String sourcePath, String destinationPath);
    int ConvertAllToUpperCase(int origin);

}
