package Inteface;

public interface IStreamingManager {
    
    //#region File Manager
    void WriteIntoFile(String fileData);
    void WriteIntoFile(String fileData, int offset, int length);
    void ReadFile(String filePath);
    void ReadFileWithWhile(String filePath);
    void ReadFileWithFileReader(String filePath);
    void CopyFile(String sourcePath, String destinationPath);
    int ConvertAllToUpperCase(int origin);
    //#endregion

    //#region Byte IO Manager
    void ReadByteArray(byte[] data);
    void ReadByteArray2(byte[] data2);
    void WriteByteArray();
    //#endregion

    //#region  Char Manager
    void ReadCharArray(char[] data);
    //#endregion

    //#region Buffer Streaming
    void BufferInputStream();
    void BufferWithMark();
    //#endregion

}
