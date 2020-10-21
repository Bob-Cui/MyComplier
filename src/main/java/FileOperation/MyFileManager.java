package FileOperation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MyFileManager {


    public static void main(String[] args) throws IOException {

        MyFileManager myFileManager = new MyFileManager();
        List<String> list = myFileManager.getFileLines("C:\\Users\\DELL\\Desktop\\WebForContest\\Complier\\src\\main\\java\\CBLexer.interp");
        for (String c:list) {
            System.out.println(c);
        }


    }


    private static void test() throws IOException {
//        List<String> stringLinkedList = new List<String>() {
    }

    public void readLine(String address) throws IOException {
        FileReader fileReader = new FileReader(address);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String strLine = null;
        int lineCount = 1;
        while (null != (strLine = bufferedReader.readLine())) {
            System.out.println(strLine);
            lineCount++;
        }
        System.out.println(lineCount + "行");
    }

    public List<String> getFileLines(String address) throws IOException {

        FileReader fileReader = new FileReader(address);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String strLine = null;
        int lineCount = 1;
        List<String> stringList = new LinkedList<>();
        while (null != (strLine = bufferedReader.readLine())) {
//            System.out.println(strLine);
            stringList.add(strLine);
            lineCount++;
        }
        return stringList;
    }

}
