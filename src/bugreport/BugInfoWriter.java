package bugreport;

import java.io.*;

public class BugInfoWriter {
    public static void main(String[] args) {
        String developerName = "davinci";
        int bugNumber = 531;
        String bugDescription = "Components not rendered properly";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("buginfo.dat");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            String bugInfo = "Developer Name:" + developerName + "\n" +
                             "Bug No:" + bugNumber + "\n" +
                             "Bug Description:" + bugDescription + "\n";

            bufferedOutputStream.write(bugInfo.getBytes());

            bufferedOutputStream.flush();
            bufferedOutputStream.close();

            System.out.println("Bug information saved to buginfo.dat");
        } catch (IOException e) {
            System.out.print(e);;
        }
    }
}

