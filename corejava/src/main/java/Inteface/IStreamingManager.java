package Inteface;

public interface IStreamingManager {
    void WriteIntoFile(String fileData);
    void WriteIntoFile(String fileData, int offset, int length);
}
