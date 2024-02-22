package Implement;
import java.io.*;
public class Student implements Serializable {

    public String name;
    public int age;

    public String toString() {
        return "\nName" + name + "\nAge" + age;
    }
}