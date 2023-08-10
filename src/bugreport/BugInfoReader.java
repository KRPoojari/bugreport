package bugreport;

import java.io.*;

public class BugInfoReader {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("buginfo.dat");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            byte[] bt = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(bt);

            System.out.println("Reading Bug Information from buginfo.dat:");
            System.out.println(new String(bt));

            bufferedInputStream.close();
        } catch (IOException e) {
            System.out.print(e);
        }
    }
}
